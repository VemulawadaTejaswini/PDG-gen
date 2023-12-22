import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(reader.readLine());
			String[] S = reader.readLine().split(" ");
			int q = Integer.parseInt(reader.readLine());
			String[] T = reader.readLine().split(" ");
			int count = 0;
			for(int i=0; i<q; i++) {
				for(int j=0; j<n; j++) {
					if(T[i].equals(S[j])) {
						count++;
					}
				}
			}
			System.out.print(count);
		} catch(IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("??\????????£????????????????????????");
		}
	}
}