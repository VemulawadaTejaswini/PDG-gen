import java.util.*;
public class Main{
	static int max;
	static int Count;
	static int len;
	static String[] ans;
	static int n;
	
	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		while(true) {
			max = -1;
			Count = -1;
			len = -1;
			ans = new String[100];
			n = sc.nextInt();
			String in = sc.next();
			if(n == 0 && in.equals("0")) break;
			dfs(in,0,1,new String[in.length()+1],0,0);
			
			if(max == -1) System.out.println("error");
			else if(Count >= 2) System.out.println("rejected");
			else {
				System.out.print(max);
				for(int i = 0; i < len; i++) {
					System.out.print(" " + ans[i]);
				}
				System.out.println();
			}
		}
	}
	
	public static void dfs(String a,int l, int r, String[] b,int sum,int count) {
		if(l == a.length()) {
			if(max < sum && sum <= n) {
				max = sum;
				ans = b;
				Count = 1;
				len = count;
			}
			else if(sum == max) {
				Count++;
			}
			return ;
		}
		if(r == a.length()+1) {
			return;
		}
		
		dfs(a,l,r+1,b,sum,count);
		
		String[] cp = Arrays.copyOf(b, b.length);
		cp[count] = a.substring(l, r);
		
		
		sum += Integer.parseInt(a.substring(l, r));
		
		dfs(a,r,r+1,cp,sum,count+1);
	}
}