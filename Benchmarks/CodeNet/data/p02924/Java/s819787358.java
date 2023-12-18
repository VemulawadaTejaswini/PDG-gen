import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long c=0;
		for(long i=1;i<n;i++) {
			c+=i;
		}
		System.out.println(c);

	}

}