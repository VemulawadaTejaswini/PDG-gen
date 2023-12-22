import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		int[] arr = new int[n];
		for(int i = 0;i < n;i++){
			arr[i] = Integer.parseInt(strArr[i]);
		}

		System.out.println(toString(arr));
		for(int i = 1;i < n;i++){
			int v = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > v){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = v;
			System.out.println(toString(arr));
		}

	}

	static String toString(int[] arr){
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < arr.length - 1;i++){
			sb.append(arr[i]);
			sb.append(" ");
		}
		sb.append(arr[arr.length -1]);
		return sb.toString();
	}
}