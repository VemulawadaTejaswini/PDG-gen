import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	static BufferedReader reader;
	final static int[] NUM = {0,2,5,5,4,5,6,3,7,6};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		String[] s = readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		s = readLine().split(" ");
		int[] A = new int[M];
		for(int m=0;m<M;m++){
			A[m] = Integer.parseInt(s[m]);
		}
		Arrays.sort(A);
		int minimum_num = 8;
		for(int m=0;m<M;m++){
			if(NUM[A[m]]<minimum_num){minimum_num=NUM[A[m]];}
		}
		int max_min = 0;
		for(int m=M-1;m>0;m--){
			if(NUM[A[m]]==minimum_num){max_min = m;break;}
		}
		
		
		StringBuilder sb = new StringBuilder();
		int left = N;
		while(left>=minimum_num){
			sb.append(A[max_min]);
			left-=minimum_num;
		}
		while(left!=0){
			//残数が組合せで作れないかチェック
			ArrayList<Integer> nums_checking = new ArrayList<>();
			nums_checking.add(M-1);
			left-=NUM[A[M-1]];
			A: while(nums_checking.size()>0&&left!=0){
				if(nums_checking.get(nums_checking.size()-1)>=0){
					for(int i=A.length-1;i>=0;i--){
						if(left>=NUM[A[i]]){
							left-=NUM[A[i]];
							nums_checking.add(i);
							continue A;
						}
					}
				}else{
					nums_checking.remove(nums_checking.size()-1);
				}
				if(nums_checking.size()==0){break;}
				int b = nums_checking.remove(nums_checking.size()-1);
				left+=NUM[A[b]];
				if((--b)>=0){
					nums_checking.add(b);
					left-=NUM[A[b]];
				}else{
					nums_checking.add(-1);
				}
			}
			if(left!=0){
				sb.deleteCharAt(sb.length()-1);
				left+=NUM[A[max_min]];
			}else{
				Integer[] tmp = nums_checking.toArray(new Integer[nums_checking.size()]);
				Arrays.sort(tmp);
				List<Integer> tmp2 = Arrays.asList(tmp);
				int insert_pointer = 0;
				for(int i=tmp2.size()-1;i>=0;i--){
					if(A[tmp2.get(i)]>A[max_min]){
						sb.insert(insert_pointer++,A[tmp2.get(i)]);
					}else{
						sb.append(A[tmp2.get(i)]);
					}
				}
				break;
			}
		}
		System.out.println(sb.toString());
	}

	private static String readLine(){
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
}