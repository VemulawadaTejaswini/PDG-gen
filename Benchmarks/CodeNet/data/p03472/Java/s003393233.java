import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int h = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		in.close();
		int amax = 0;
		for(int i=0;i<n;i++) {
			amax = Math.max(amax, a[i]);
		}
		Arrays.sort(b);
		int damage = 0;
		int count = 0;
		boolean beat = false;
		for(int i=n-1;i>=0 && b[i]>amax;i--) {
			damage += b[i];
			count++;
			if(damage>=h) {
				beat = true;
				break;
			}
		}
		if(beat) System.out.println(count);
		else System.out.println(count + (h-damage)/amax + ((h-damage)%amax==0?0:1));

	}

}
