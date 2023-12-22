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
					arr.add(i);
				}

				for(int i = 0;;i++){
					if(arr.size() <= i)break;
					int tmp_num = arr.get(i);
					for(int j = arr.size() -1; j >= 0;j--){
						if(arr.get(j) % tmp_num == 0)arr.remove(j);
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