import java.util.*;
import java.io.*;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ar[][] = new int[n][3];
		for(int i = 0; i < n; i++) {
			String input[] = (br.readLine()).trim().split("\\s+");
			ar[i][0] = Integer.parseInt(input[0]);
			ar[i][1] = Integer.parseInt(input[1]);
			ar[i][2] = Integer.parseInt(input[2]);                           
		}
		int a = ar[0][0], b = ar[0][1], c = ar[0][2];
		for(int i = 1; i < n; i++) {
			// picking a
			int oldA = a, oldB = b, oldC = c;
			a = ar[i][0] + Math.max(oldB, oldC);
			b = ar[i][1] + Math.max(oldA, oldC);
			c = ar[i][2] + Math.max(oldA, oldB);
		}
		System.out.println(Math.max(a, Math.max(b, c)));
	}
}
