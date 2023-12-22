import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(scan.hasNext()){
			double a = sd(), b = sd();
			if(a<35.5 && b<71) out.println("AAA");
			else if(a<37.5 && b<77) out.println("AA");
			else if(a<40 && b<83) out.println("A");
			else if(a<43 && b<89) out.println("B");
			else if(a<50 && b<105) out.println("C");
			else if(a<55 && b<116) out.println("D");
			else if(a<70 && b<148) out.println("E");
			else out.println("NA");
		}
		out.flush();
	}

	static double sd() {
		return Double.parseDouble(scan.next());
	}
}