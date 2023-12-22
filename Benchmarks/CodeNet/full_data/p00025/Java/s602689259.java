import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(scan.hasNext()){
			int[] a = new int[4];
			int[] b = new int[4];
			for (int i = 0; i < 4; i++) a[i] = si();
			for (int i = 0; i < 4; i++) b[i] = si();
			int hit = 0,blow = 0;
			for (int i = 0; i < 4; i++) {
				if(a[i]==b[i]) hit++;
				else{
					for (int j = 0; j < 4; j++) {
						if(a[j] == b[i]){
							blow++;
							break;
						}
					}
				}
			}
			out.println(hit+" "+blow);
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}