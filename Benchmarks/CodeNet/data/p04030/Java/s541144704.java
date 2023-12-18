import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		String[] b = a.split("");

		int bCount =0;

		while(b[bCount]=="B") {
			bCount++;
		}
		a = a.substring(bCount);
		String[] c = a.split("");

		String z ="";

		for(int i=0; i<a.length();i++) {
			if(c[i]=="0") {
				z = z + "0";
			}else if(c[i]=="1") {
				z = z + "1";
			}else {
				z = z.substring(0,z.length()-1);
			}
		}
	}

}
