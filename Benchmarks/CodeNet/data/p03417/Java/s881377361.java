import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		long n=Long.parseLong(scan.next());
		long m=Long.parseLong(scan.next());
		if (n>2 || m>2){
			long ans=Math.max(1,n-2)*Math.max(1,m-2);
			System.out.print(ans);
		}else if (n==1&&m==1){
			System.out.print(1);
		}else{
			System.out.print(Math.max(n, m)-2);
		}

	}
}
//end