import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n+1];
		
		for(int i=1;i<=n;i++) {
		a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int b=0;int c=0;
		for(int i=n;i>=1;i--) {
			if(b<c)b+=a[i];
			else c+=a[i];
		}
		if(b<c)System.out.println(c);
		else System.out.println(b);
		
	}
}
