import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] a){

		ArrayList<Integer> arr = new ArrayList<Integer>();
		String str;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(null != ( str = bf.readLine() )){
				int n = Integer.parseInt(str);

				for(int i = 2; i <= n; i++){
					for(int j = 2; j <= i / 2; j++){
						if(!(j + 1 <= i / 2)){
							arr.add(i);
						}
						if(i % j == 0)break;
					}
				}

				System.out.println(arr.size());
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