import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		// 
		String[] line = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int a = Integer.parseInt(line[1]);
		int b = Integer.parseInt(line[2]);
		br.close();
		int blue = 0;
		if((a+b)*1000<=n) {
			blue = 1000 * a;
		}else if(a == 0) {
			blue = 0;
		}else {
			int mod = n%(a+b);
			int div = n/(a+b);
			if(mod==0 || mod<=a) {
				blue = a * div + mod;
			}else {
				blue = a * div + (mod-a);
			}
		}
		System.out.println(blue);
	}
}
