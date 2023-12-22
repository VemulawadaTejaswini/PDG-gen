import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			int n = Integer.parseInt(br.readLine());
			String[] strArray = br.readLine().split("\\s");
			
			Arrays.sort(strArray, Collections.reverseOrder());
			
			for (int i = 0; i < n; i++) {
				System.out.print(strArray[i]);
				if(i == n-1){
					System.out.println();
				}else{
					System.out.print(" ");
				}	
			}
			
			br.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}