import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] a){

		String str;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
			str = bf.readLine();
			int count = Integer.parseInt(str);
			for(int i = 0; i < count; i++){
				str = bf.readLine();
				String[] arr = str.split(" ");
				int[] iArr = new int[]{Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),};
				Arrays.sort(iArr);
				String ans = "NO";
				if(Math.pow(iArr[0],2)+ Math.pow(iArr[1],2) == Math.pow(iArr[2],2)){
					ans = "YES";
				}
				System.out.println(ans);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
			}
		}
	}
}