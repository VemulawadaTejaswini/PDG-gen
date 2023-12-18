import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] p = new int[M];
		String[] s = new String[M];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			p[i] = Integer.parseInt(st.nextToken());
			s[i] = st.nextToken();
		}
		
		for(int i=0; i<M; i++)
			System.out.println(p[i] + " " + s[i]);
		int ac =0, wa = 0;
		
		for(int i=1; i<M; i++) {
			if(s[i-1].equals("WA")) {
				wa++;
				if(p[i] == p[i-1] && s[i].equals("AC")) {
					ac++;
				}
			} else {
				ac++;
				break;
			}
		}
		
		System.out.println(ac + " "+ wa);
	}

}