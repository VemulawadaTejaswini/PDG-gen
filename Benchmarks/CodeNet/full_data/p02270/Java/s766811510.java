
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] w = new int [n];
			int[] t = new int [k];
			char sigh = 'g';
			int max = 0;
			for(int i=0;i<n;i++) {
				w[i] = sc.nextInt();
			}
			Arrays.sort(w);
			for(int i=0;i<k;i++)
				t[i] = 0;
			
			int c = 0;
			for(int i=n-1;i>=0;i--) {
				t[c] += w[i];
				if(sigh=='g'&&c==k-1) {
					sigh='b'; c=k;
				}
				if(sigh=='b'&&c==0) {
					sigh='g'; c=-1;
				}
				if(sigh=='g')c++;
				else c--;
			}
			for(int i=0;i<k;i++) {
				max = Math.max(t[i],max);
			}
			System.out.println(max);
		}
	}
}


