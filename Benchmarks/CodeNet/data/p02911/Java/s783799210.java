
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int k = Integer.parseInt(tmpArray[1]);
		int q = Integer.parseInt(tmpArray[2]);

		int points[] = new int[n];

//		int a[] = new int[q];

		for(int i = 0; i < q; i++){
			int tmp = Integer.parseInt(br.readLine()) - 1;

			points[tmp]++;
		}

		for(int i = 0; i < n; i++){
			int result = k - (q - points[i]);

			if(result > 0){
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
