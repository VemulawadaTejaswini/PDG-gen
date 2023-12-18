import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String inp = br.readLine();
			String chr[] = in.split(" ");
			String s[] = inp.split("");
			int n = Integer.parseInt(chr[0]);
			int k = Integer.parseInt(chr[1]);
			String ans ="";
			for(int i =0; i<n;i++) {
				if(i==k-1) {
					s[i]=s[i].toLowerCase();
				}
				ans+=s[i];
			}
			 System.out.println(ans);
		}
	}
}