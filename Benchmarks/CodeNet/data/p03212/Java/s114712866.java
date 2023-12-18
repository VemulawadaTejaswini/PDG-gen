

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static boolean[] res = new boolean[3];
	static String[] num;
	
	public static void main(String[] args) throws Exception{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int n = Integer.parseInt(br.readLine());
			int result = 0;
			if(n >= 357) {
				for(int i=n; i>=357; i--) {
					num = String.valueOf(i).split("");
					res[0] = false;
					res[1] = false;
					res[2] = false;
					for(int j=0; j<num.length; j++) {
						int r = Integer.parseInt(num[j]);
						if(r == 3) res[0] = true;
						else if(r == 5) res[1] = true;
						else if(r == 7) res[2] = true;
						else {
							res[0] = false;
							break;
						}
					}
					if(res[0] && res[1] && res[2]) result++;
				}
			}
			System.out.println(result);
		}

	}

}
