import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] h=new int[n+1];
		int[] preh=new int[n+1];
		for(int i=1;i<=n;i++) {
			int buf=sc.nextInt();
			h[i]=buf;
			preh[i]=buf;
		}
		Arrays.sort(h);

		for(int i=1;i<=n;i++) {
			if(preh[i]>h[(n+1)/2]) {
				System.out.println(h[(n+1)/2]);
			}else {
				System.out.println(h[(n+1)/2+1]);
			}

		}
	}
}