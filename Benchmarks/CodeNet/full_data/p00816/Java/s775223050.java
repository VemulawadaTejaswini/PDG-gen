import java.util.*;
public class Main {
	//0224 start
	//0300 stop
	//2300 restart
	//2323 AC
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
		int start = -1, i = 0, end = a[i++], sum = 0;
		while(start != len - 1){
			String temp = numstr.substring(start + 1, end + 1);
			sum += Integer.parseInt(temp);
			start = end;
			end = a[i++];
		}
		return sum;
	}


	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			t = sc.nextInt();
			numstr = sc.next();
			if(t == 0 && numstr.equals("0")) break;
			len = numstr.length();
			ansarray = new int[len + 1];
			work = new int[len + 1];
			Arrays.fill(work, -1);
			ans = -1;
			rejected = false;
			dfs(0,-1);
			if(rejected){
				System.out.println("rejected");
			}
			else if(ans == -1){
				System.out.println("error");
			}
			else{
				System.out.print(ans);
				StringBuilder sb = new StringBuilder();
				for(int i = 0, ind = 0; i < len; i++){
					sb.append(numstr.charAt(i));
					if(ansarray[ind] == i){
						ind++;
						sb.append(" ");
					}
				}
				System.out.println(" " + sb.toString());
			}
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}