import java.io.PrintWriter;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		PrintWriter out = new PrintWriter(System.out);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			byte s = Byte.parseByte(scan.next());
			byte g = Byte.parseByte(scan.next());
			if(s<g || s<=5) out.println(range(s,g));
			else{
				if(g>=6) out.println(range(s,9)+" "+range(5,0)+" "+range(1,g));
				else out.println(range(s,9)+" "+range(5,g));
			}
		}
		out.flush();
	}

	static String range(int p,int q){
		int d = p<q ? 1:-1;
		String mes = "";
		for (int i = p; i != q; i+=d) {
			mes+=i+" ";

		}
		return mes+q;
	}
}