import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
		String[] number = line.sprit(" ");
		int a = Integer.parseInt(number[0]);
		int b = Integer.parseInt(number[1]);
		int c = Integer.parseInt(number[2]);
		int d = Integer.parseInt(number[3]);
		int r = 0;
		if(a < c) {
			if(c < b) {
				r = b - c;
				System.out.println(r);
			} else if(b < c) {
				System.out.println(r);
			}
		} else if(c < a) {
			if(a < d) {
				r = d - a;
				System.out.println(r);
			} else if(d < a) {
				System.out.println(r);
			}
		}
	}
}