import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int a=0,b=0,ab=0,o=0;
		while(scan.hasNext()){
			String mozi = scan.next();
			if(mozi.contains("AB")){
				ab++;
				continue;
			}
			if(mozi.contains("A")) a++;
			if(mozi.contains("B")) b++;
			if(mozi.contains("O")) o++;
		}
		out.println(a);
		out.println(b);
		out.println(ab);
		out.println(o);
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}