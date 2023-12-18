

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();

		int l = 0;
		int r = n;

		String[] subRights = new String[n];
		for(int i = 0; i < n; i++){
			subRights[i] = str.substring(i);
		}

		while(r - l > 1){
			int mid = (l + r)/2;

			boolean hit = false;
			for(int i = 0; i <= n - 2*mid; i++){
				String subLeft = str.substring(i, i + mid);
//				String subRight = str.substring(i + mid);

//				if(subRight.contains(subLeft)){
				if(subRights[i + mid].contains(subLeft)){
					hit = true;
					break;
				}
			}

			if(hit){
				l = mid;
			}
			else {
				r = mid;
			}
		}

		System.out.println(l);
	}

}
