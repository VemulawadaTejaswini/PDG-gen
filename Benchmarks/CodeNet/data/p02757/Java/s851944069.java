import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String[] line = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int p = Integer.parseInt(line[1]);
		int count = 0;
		
		
		String str = br.readLine();
		br.close();
		for(int i=0;i<n;i++) {
			int start = i;
			for(int j =start+1;j<n+1;j++) {
				Long num = Long.parseLong(str.substring(start,j));
				if(num%p==0) {
					count++;
				}
			}
		}
		System.out.println(count);

	}
}