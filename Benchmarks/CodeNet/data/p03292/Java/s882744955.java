import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[3];
		int max=0;
		int suffix=0;
		for(int i=0;i<3;i++) {
			a[i]=scan.nextInt();
			if(max<a[i]) {
				max=a[i];
				suffix=i;
			}
		}
		scan.close();
		a[suffix]=0;
		Arrays.sort(a);
		int ans=0;
		for(int i=1;i<3;i++) {
			ans+=a[i]-a[i-1];
		}
		System.out.println(ans);
	}
}