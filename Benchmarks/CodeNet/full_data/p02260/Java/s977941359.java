import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		try {
			int lim = Integer.parseInt(in.readLine());

			String[] nums = in.readLine().split(" ");
			int[] a = new int[lim];
			
			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(nums[i]);
			}
			
			int cnt = 0;
			for (int i = 0; i < a.length; i++) {
				int mini = i;
				for (int j = i; j < a.length; j++) {
					if (a[j] < a[mini]) {
						mini = j;
					}
				}

				if (i != mini) {
					int tmp = a[i];
					a[i] = a[mini];
					a[mini] = tmp;
					cnt++;
				}
			}
			
			System.out.print(a[0]);
			for (int i = 1; i < a.length; i++) {
				System.out.print(" " + a[i]);
			}
			System.out.println();
			
			System.out.println(cnt);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}