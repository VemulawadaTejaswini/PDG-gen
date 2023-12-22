import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int n = Integer.parseInt(str);

		str = br.readLine();

		String numArray[] = str.split(" ");

		Arrays.sort(numArray);

		for(int i=0; i<n-1; i++){

			System.out.print(numArray[i] + " ");

		}
		System.out.println(numArray[n]);
	}
}