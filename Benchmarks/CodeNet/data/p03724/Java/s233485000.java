import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] d = new int[n];
		Arrays.fill(d, 0);
		for(int i=0;i<m;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			d[Math.min(a[i], b[i])-1] ++;
			d[Math.max(a[i], b[i])-1] --;
		}
		sc.close();
		boolean success = true;
		for(int i=0;i<n;i++){
			if(d[i]%2!=0){
				success = false;
				break;
			}
		}
		if(success)System.out.println("YES");
		else System.out.println("NO");

	}

}