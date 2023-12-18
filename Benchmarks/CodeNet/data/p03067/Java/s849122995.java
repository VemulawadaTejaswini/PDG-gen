import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader in = new BufferedReader(new FileReader(new File("input.txt")));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] l = in.readLine().split(" ");
		byte a,b,c;
		a=Byte.valueOf(l[0]);
		b=Byte.valueOf(l[1]);
		c=Byte.valueOf(l[2]);
		if(a<b) {
			System.out.println(a<c&&c<b?"Yes":"No");
		}else {
			System.out.println(b<c&&c<a?"Yes":"No");
		}
	}
}
