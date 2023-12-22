import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		long[] arr = new long[strArr.length];
		for(int i = 0; i < strArr.length; i++){
			arr[i] = Long.parseLong(strArr[i]);
		}
		Arrays.sort(arr);
		System.out.printf("%d %d %d%n",arr[0], arr[1], arr[2]);
	}
}