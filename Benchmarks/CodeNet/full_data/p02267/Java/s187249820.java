import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./ALDS1_4_A-in10.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] s = new int[n+1];
		String[] l = br.readLine().split(" ");
		for(int i = 0; i < n; ++i){
			s[i] = Integer.parseInt(l[i]);
		}
		int q = Integer.parseInt(br.readLine());
		l = br.readLine().split(" ");
		int[] t = new int[q];
		for(int i = 0; i < n; ++i) {
			t[i] = Integer.parseInt(l[i]);
		}
		//long start = System.nanoTime();
		int cnt = 0;
		for(int i = 0; i < q; ++i) {
			s[n] = t[i];
			int j = 0;
			while(t[i] != s[j]) {
				j += 1;
			}
			if(j != n){
				cnt += 1;
			}
		}
		System.out.println(cnt);
		/*System.out.println("Time:" + (System.nanoTime() - start) / 1000000f + " ms");

		start = System.nanoTime();
		cnt = 0;
		for(int i = 0; i < q; ++i) {
			for(int j = 0; j < n; ++j){
				if(s[j] == t[i]){
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
		System.out.println("Time:" + (System.nanoTime() - start) / 1000000f + " ms");
		*/
	}

}