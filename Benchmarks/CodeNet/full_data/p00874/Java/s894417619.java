import java.util.Arrays;
import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	int n1, n2;
	int[] array1, array2;
	
	public void run() {
		while (true) {
			n1 = in.nextInt(); n2 = in.nextInt();
			if (n1 == 0 && n2 == 0) break;
			array1 = new int[n1+1]; array2 = new int[n2+1];
			
			for (int i = 0; i < n1; i++)
				array1[i] = in.nextInt();
			for (int i = 0; i < n2; i++)
				array2[i] = in.nextInt();
			
			Arrays.sort(array1); Arrays.sort(array2);
			
			int ans = 0;
			int i = n1, j = n2;
			while (array1[i] != 0 || array2[j] != 0) {
				if (array1[i] == array2[j]) {
					ans += array1[i--]; j--;
				} else if (array1[i] < array2[j]) {
					ans += array2[j--];
				} else {
					ans += array1[i--];
				}
			}
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}