import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int n = s.length();
		
		long ans = 0L;
		for (int i=0; i<Math.pow(2,n-1); i++) {
			StringBuilder sb = new StringBuilder(s);
			for (int j=n-1; j>=0; j--) {
				if ((1&i>>j) == 1) {
					sb.insert(j+1,"+");
				}
			}
			
			String[] ar = sb.toString().split("\\+",0);
			for (int j=0; j<ar.length; j++) {
				ans += Long.parseLong(ar[j]);
			}
		}
		
		System.out.println(ans);
	}
}
