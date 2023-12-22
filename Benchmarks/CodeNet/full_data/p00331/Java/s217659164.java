import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str;
		while((str=br.readLine())!=null){
			String[] sp = str.split(" ");

			int h = Integer.parseInt(sp[0]);
			int r = Integer.parseInt(sp[1]);

			if(h + r == 0){
				System.out.println(0);
			} else if(h + r > 0){
				System.out.println(1);
			} else{
				System.out.println(-1);
			}
		}
	}
}