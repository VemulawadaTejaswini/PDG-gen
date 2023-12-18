
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		boolean hantenFlag = false;
		
		StringBuffer prefix = new StringBuffer("");
		StringBuffer suffix = new StringBuffer("");
				
		String[][] asas = new String[n][3];
		for(int i = 0 ; i < n ; i++) {
			asas[i] = br.readLine().split(" ");
			
		}
		for(int i = 0; i < n ; i++) {
			if(Integer.parseInt(asas[i][0]) == 1) {
				hantenFlag = !hantenFlag;
			}else {
				if(Integer.parseInt(asas[i][1]) == 1 && !hantenFlag || Integer.parseInt(asas[i][1]) == 2 && hantenFlag) {
//					StringBuffer sb = new StringBuffer(asas[i][2]).append(s);
//					s = asas[i][2] + s;
//					s = sb.toString();
					prefix = new StringBuffer(asas[i][2]).append(prefix);
				}else {
//					StringBuffer sb = new StringBuffer(s).append(asas[i][2]);
//					s = s + asas[i][2];
//					s = sb.toString();
					suffix = suffix.append(asas[i][2]);
				}
			}
		}
//		StringBuffer sb = new StringBuffer(prefix);
//		sb = sb.append(s);
//		sb = sb.append(suffix);
		s = prefix + s  + suffix;
		
		if(hantenFlag) {
			StringBuffer sb = new StringBuffer(s);
			s = sb.reverse().toString();

		}
		System.out.println(s);
	}

}
