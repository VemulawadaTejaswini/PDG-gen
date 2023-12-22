import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		long[] heightArray = new long[n];

		for (int i = 0; i < n; i++) {
			heightArray[i] = stdIn.nextLong();
		}

		long cnt = 0;

		for (int i = 0; i < heightArray.length; i++) {

			if(heightArray[i] >= n) {
				continue;
			}

			for (int j = i + 1; j < heightArray.length; j++) {
				int abs = j - i;
				long sumOfHeight = heightArray[i] + heightArray[j];
				
				if(abs == sumOfHeight) {
					cnt++;
				}

			}
		}

		System.out.println(cnt);
		
		stdIn.close();

	}

}
