import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		//String t = sc.next();
		//String g = sc.next();
		long n = sc.nextLong();
		long m = sc.nextLong();
		long k = sc.nextLong();
		long l = sc.nextLong();
		//long count=0;

		/*for(int i=1;i<=n;i++) {

		}*/
		if(Math.abs(n-k)<=l || Math.abs(n-m)+Math.abs(m-k)<=2*l) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		//System.out.println((int)Math.ceil((n+m)/2.0));
		//System.out.println(s.substring(0,1)+t.substring(1,2)+g.substring(2,3));
	}
}


