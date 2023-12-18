import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		
		int h = Integer.parseInt(line[0]);
		int n = Integer.parseInt(line[1]);
		
		line = br.readLine().split(" ");
		br.close();		
		boolean flg = false;
		
		for(String s: line) {
			if((h -= Integer.parseInt(s))<=0) {
				flg=true;
				break;
			}
		}

		if(flg) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}
}
