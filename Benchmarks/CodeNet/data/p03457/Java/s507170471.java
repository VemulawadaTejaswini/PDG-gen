import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []x = new int [n+1];
		int []y = new int [n+1];
		int []t = new int [n+1];

		t[0] = 0;
        x[0] = 0;
        y[0] = 0;		
		for (int i = 1; i < n + 1; ++i) {
			t[i] =sc.nextInt();
			x[i] =sc.nextInt();
			y[i] =sc.nextInt();
		}

		boolean can = true;
		for (int i = 0; i < n; ++i) {
			int dt = t[i+1] - t[i];
			int dist = Math.abs(x[i + 1] - x[i])
				+ Math.abs(y[i + 1] - y[i]);
			if (dt < dist) {
				can = false;
			}
			if (dt % 2 != dist % 2) {
				can = false;
			}
		}
		if(can) {
			System.out.print("Yes");
		} else {
			System.out.println("No");
	    }
	}
}


