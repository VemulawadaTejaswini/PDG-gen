import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> al = new ArrayList<Integer>();
		String str;
		while ((str = br.readLine()) != null) {
			if (str.length() == 0) {
				break;
			}
			al.add(Integer.parseInt(str));
		}
		int[] result = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) <= 36) {
				result[i] = check(al.get(i));
			} else {
				result[i] = 0;
			}
		}
		
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		
	}

	private static int check(int no) {
		int cnt = 0;
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					for (int l = 0; l <= 9; l++) {
						if ((i + j + k + l) == no) {
							cnt++;
						}
					}
				}
			}
		}
		return cnt;
	}
	
}