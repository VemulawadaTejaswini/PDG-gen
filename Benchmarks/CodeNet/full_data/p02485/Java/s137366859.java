import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			int s, count = 0;
			while((s = Integer.parseInt(br.readLine()))!=0) {
			while(s > 0) {
				count += s%10;
				s = s/10;
			}
			System.out.println(count);
			count = 0;
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}