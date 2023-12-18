import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long gokei=0;
		int kin[]=new int[n];

		for(int i=0;i<n;i++) {
			kin[i]=Integer.parseInt(sc.next());
		}

		for(int i=0;i<m;i++) {
			Arrays.sort(kin);
			kin[n-1]/=2;
			if(kin[n-1]==0)
				break;


		}
	    for(int i=0;i<n;i++)
	    	gokei+=kin[i];
	    System.out.println(gokei);

	}

}