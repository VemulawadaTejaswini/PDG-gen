

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[w + 1];
		for (int i = 1; i <= w ; i++) {
			arr[i] = i;
		}
		
		String line;
		while ((line = br.readLine()) != null) {
			String[] ab = line.split(",");
			int a1 = Integer.parseInt(ab[0]);
			int b1 = Integer.parseInt(ab[1]);
			int temp = arr[a1];
			arr[a1] = arr[b1];
			arr[b1] = temp;
		}

		for (int i = 1; i <= w ; i++) {
			System.out.println(arr[i]);
		}
	}

}