import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuilder s = new StringBuilder();
			String[] strArray;	
			String line = br.readLine();
			while(line != "0 0"){
				strArray = line.split("\\s");
				for (int i = 0; i < Integer.parseInt(strArray[0]); i++) {
					for (int j = 0; j <  Integer.parseInt(strArray[1]); j++) {
						s.append("#");						
					}
					s.append("\n");
				}
				System.out.println(s);
				s.setLength(0);
				line = br.readLine();
			}
			
			
			br.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}