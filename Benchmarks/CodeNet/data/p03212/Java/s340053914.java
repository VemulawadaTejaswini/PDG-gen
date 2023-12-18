import java.util.*;

public class Main {
	static int count=0;
	
	static boolean check(long k) {
		String s=String.valueOf(k);
		int len=s.length();
		boolean three=false,five=false,seven=false;
		for(int i=0;i<len;++i) {
			if (s.charAt(i)=='3') {
				three=true;
			}else if(s.charAt(i)=='5') {
				five=true;
			}else if (s.charAt(i)=='7') {
				seven=true;
			}
			
		}
		if (three&&five&&seven) {
			return true;
		}else {
			return false;
		}
	}
	
	static void dfs(long k,int n) {				
		if (k<=n) {
			if (check(k))++count;
			dfs(k*10+3,n);
			dfs(k*10+5,n);
			dfs(k*10+7,n);
		}
		
		
		
	}
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		dfs(0,n);
		System.out.print(count);

	}
}
//end
