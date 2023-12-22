import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		read();
	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int V = Integer.parseInt(s[1]);
		s   = br.readLine().split(" ");
		int B = Integer.parseInt(s[0]);
		int W = Integer.parseInt(s[1]);
		int T = Integer.parseInt(br.readLine());
		
		int distance = B - A;
		int vdis =  V - W;
		
		if( distance < 0  || vdis <= 0 ) {
			System.out.println("NO");
			br.close();
			return;
		}
		
		int times = distance /vdis;
		if(  times > T) {
			System.out.println("NO");
			br.close();
			return;
		}
		else if ( times ==  T  && distance %vdis != 0 ){
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
		
		br.close();

	}

}
