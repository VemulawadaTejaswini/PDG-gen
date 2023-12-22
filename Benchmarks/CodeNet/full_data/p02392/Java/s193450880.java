import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		long[] arr = new long[strArr.length];
		for(int i = 0;i < strArr.length;i++){
			arr[i] = Long.parseLong(strArr[i]);
		}
		System.out.println((arr[0] < arr[1] && arr[1] < arr[2]) ? "Yes" : "No");
	}
}