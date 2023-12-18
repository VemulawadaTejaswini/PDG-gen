import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] p = new int[n];
		for(int i=0;i<n;i++) p[i] = in.nextInt();
		int ans = 0;
		for(int i=1;i<n-1;i++) {
			int tmp = p[i];
			int[] array = new int[3];
			array[0] = p[i-1];
			array[1] = p[i];
			array[2] = p[i+1];
			Arrays.sort(array);
			if(tmp==array[1]) ans++;
		}
		System.out.println(ans);
		in.close();
	}

}
