
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] an = new int[n];
		String s[] = br.readLine().split(" ");
		for(int i = 0 ; i < n ; i++) {
			an[i] = Integer.parseInt(s[i]);
		}
		
		Arrays.sort(an);
		boolean flag = true;
		for(int i = 0; i< n-1 ; i++) {
			if(an[i]==an[i+1]) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
