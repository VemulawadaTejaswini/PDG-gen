import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int MAX_A_I = 10000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//System.setIn(new FileInputStream("./ALDS1_6_A-in9.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] c = new int[MAX_A_I + 1];
		
		//long start = System.nanoTime();
		String[] l = br.readLine().split(" ");
		for(int i = 0; i < n; ++i) {
			c[Integer.parseInt(l[i])] += 1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i <= MAX_A_I; ++i) {
			while(c[i] > 0){
				sb.append(i + " ");
				//sb.append(" ");
				c[i] -= 1;
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
		//System.out.println((System.nanoTime() - start)/1000/1000 + " ms");
	}

}