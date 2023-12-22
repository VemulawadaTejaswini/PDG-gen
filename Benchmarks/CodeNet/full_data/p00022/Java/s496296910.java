

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while (!(line = br.readLine()).equals("0")) {
            int n = Integer.parseInt(line);
            int i, L = 0, R  = 0;
            int[] a = new int[n];
            for (i = 0; i < n; i++) {
                a[i] = Integer.parseInt(br.readLine());
            }
			L = R = a[0];
			for(i = 1; i < n; i++){
				if( L >= R ) ; else L = R;
				if( R + a[i] < a[i] ) R = a[i]; else R = R + a[i];
			}
			if( L > R) {
				System.out.println(L);
			}else {
				System.out.println(R);
			}
		}


	}

}

