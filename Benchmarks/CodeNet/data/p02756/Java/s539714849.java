
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		boolean hantenFlag = false;
		
		String[][] asas = new String[n][3];
		for(int i = 0 ; i < n ; i++) {
			asas[i] = br.readLine().split(" ");
			
		}
		for(int i = 0; i < n ; i++) {
			if(Integer.parseInt(asas[i][0]) == 1) {
				hantenFlag = !hantenFlag;
			}else {
				if(Integer.parseInt(asas[i][1]) == 1 && !hantenFlag || Integer.parseInt(asas[i][1]) == 2 && hantenFlag) {
					s = asas[i][2] + s;
				}else {
					s = s + asas[i][2];
				}
			}
		}
		if(hantenFlag) {
			StringBuffer sb = new StringBuffer(s);
			s = sb.reverse().toString();

		}
		System.out.println(s);
	}

}
