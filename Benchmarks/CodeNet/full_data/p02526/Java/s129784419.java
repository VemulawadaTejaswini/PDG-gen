import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(reader.readLine());
			int[] S = new int[n];
			for(int i=0; i<n; i++) {
				S[i] = Integer.parseInt(reader.readLine());
			}
			int q = Integer.parseInt(reader.readLine());
			int[] T = new int[q];
			for(int i=0; i<q; i++) {
				T[i] = Integer.parseInt(reader.readLine());
			}
			int count = 0;
			for(int i=0; i<q; i++) {
				for(int j=0; j<n; j++) {
					if(T[i] == S[j]) {
						count++;
					}
				}
			}
			System.out.println(count);
		} catch(IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("??\????????£????????????????????????");
		}
	}
}