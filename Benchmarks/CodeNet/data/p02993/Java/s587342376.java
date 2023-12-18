import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split("");
			int x = Integer.parseInt(chr[0]);
			int y = Integer.parseInt(chr[1]);
			String ans = "Good";
			for(int i =2; i<chr.length; i++) {
				if(x==y) {
					ans = "Bad";
					break;
				}else {
					x=y;
					y=Integer.parseInt(chr[i]);
				}
			}

			 System.out.println(ans);
		}
	}
}