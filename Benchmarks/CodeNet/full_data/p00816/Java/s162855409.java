import java.util.*;
public class Main {
	//0224 start
	//0300 stop
	//2300 restart
	int t, num,len;
	String numstr;
	int [] ansarray,work;
	int ans;
	boolean rejected;

	private void dfs(int deep, int index){
		if(index == len-1){
			int res = calc(work);
			if(res <= t && res > ans){
				ans = res;
				ansarray = work.clone();
				rejected= false;
			}
			else if(res == ans){
				rejected = true;
			}
		}

		for(int i = index + 1; i < len; i++){

			work[deep] = i;
			dfs(deep + 1, i);
			work[deep] = -1;
		}
	}


	private int calc(int[] a) {
		int start = -1;
		int i = 0;
		int end = a[i++];
		int sum = 0;
		//System.out.println("b = " + Arrays.toString(a));
		while(start != len - 1){
			//System.out.println("start = " + start + " " + end);
			String temp = numstr.substring(start + 1, end + 1);
			//System.out.println("temp= " + temp + "start = " + start + " end= " + end);
			sum += Integer.parseInt(temp);
			start = end;
			end = a[i++];
		}
		//System.out.println("a = " + Arrays.toString(a) + " " + sum);
		//System.out.println();
		return sum;
	}


	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			t = sc.nextInt();
			num = sc.nextInt();
			if((t|num) == 0) break;
			numstr = num + "";
			len = numstr.length();
			ansarray = new int[len + 1];
			work = new int[len + 1];
			Arrays.fill(work, -1);
			ans = -1;
			rejected = false;
			dfs(0,-1);
			if(rejected){
				System.out.println("rejected");
//				System.out.println("ans = " + ans);
//				System.out.println("array = " + Arrays.toString(ansarray));
			}
			else if(ans == -1){
				System.out.println("error");
			}
			else{
				System.out.print(ans);
				int start = -1, end = ansarray[0];
				for(int i = 0; i < ansarray.length - 1; i++){
					if(ansarray[i] == -1) break;
					String temp = numstr.substring(start + 1, end + 1);
					System.out.print(" " + temp);
					start = end;
					end = ansarray[i + 1];
				}
				System.out.println();
			}

		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}