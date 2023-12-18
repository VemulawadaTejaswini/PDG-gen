import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
        long[]a= new long[n];
        
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        long ans=a[0];
        
        for(int i=1;i<n;i++) {
            ans= gcd(ans,a[i]);
        }
        System.out.println(ans);
	}
		public static long gcd(long a, long b) {	//最大公約数
	        if(b%a==0) {
	            return a;
	        } else {
	            return gcd(b%a,a);
	        }
		}
}
