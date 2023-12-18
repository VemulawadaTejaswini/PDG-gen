import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());
		long ans =1;
		if (Math.abs(n-m)>1){
			System.out.print(0);
		}else{
			if (n==m)ans=2;
			while(n!=1 || m !=1){
				ans*=n;
				ans%=1000000007;
				ans*=m;
				ans%=1000000007;

				n=Math.max(1, n-1);
				m=Math.max(1, m-1);
			}
			System.out.print(ans);

		}



	}
}
//end
