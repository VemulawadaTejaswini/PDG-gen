import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int wsum[] = new int[n];
		wsum[0] = sc.nextInt();
		for(int i=1;i<n;i++) {
			wsum[i] = wsum[i-1]+sc.nextInt();
		}
		
		int sum = wsum[n-1];
		int t = 0;
		
		for(int i=0;i<n-1;i++) {
			if(wsum[i]<sum/2 && wsum[i+1]>sum/2) {
				t=i;
				break;
			}
		}
		
		if(((sum-wsum[t])-wsum[t])>((sum-wsum[t+1])-wsum[t+1])) {
			System.out.print(zettaichi((sum-wsum[t+1])-wsum[t+1]));
		}
		else {
			System.out.print(zettaichi((sum-wsum[t])-wsum[t]));
		}
	}
	public static int zettaichi(int a) {
		if(a>=0)
			return a;
		else
			return -a;
	}
	
}