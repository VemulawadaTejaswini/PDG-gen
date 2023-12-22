import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		
		try {
			while((line = br.readLine()) != null) {
				line = line.trim();
				String[] values = line.split("\\s");
				if(values.length != 2) System.exit(-1);
				
				int[] value = new int[2];
				int i = 0;
				for(String s : values) {
					value[i] = Integer.parseInt(s);
					if(value[i] > 2000000000 || value[i] < 0) System.exit(-2);
					i++;
				}
				int a = value[0];
				int b = value[1];

				int lcm = 1; //最小公倍数
				int gcd = 1; //最大公約数
				int limit = a > b ? a : b;
				
				for(int j = 2; j < limit / 2; j++) {
					while(a % j == 0 && b % j == 0) {
						lcm *= j;
						gcd *= j;
						a /= j;
						b /= j;
					}
					while(a % j == 0 || b % j == 0) {
						gcd *= j;
						if(a % j == 0) a /= j;
						else b /= j;
					}
				}
				
				System.out.println(lcm + " " + gcd);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}