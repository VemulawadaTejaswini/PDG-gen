import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int  n=scan.nextInt();
		try {
			int a[]=new int[n];
			long x=1;
			for(int i=0;i<n;i++) {
				a[i]=scan.nextInt();
				x*=a[i];
			}
			System.out.println(x);
		}
		catch(Exception e) {
			System.out.println("-1");
		}
		
		
	}

}