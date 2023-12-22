import java.io.PrintWriter;
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(sc.hasNext()){
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if((m & f & r) == -1) break;
			if((m | f) == -1) out.println("F");
			if(m + f >= 80) out.println("A");
			if(m + f >= 65 && m + f < 80) out.println("B");
			if(m + f >= 50 && m + f < 65)out.println("C");
			if(m + f >= 40 && m + f < 50){
				if(r >= 50) out.println("C");
				else out.println("D");
			}
			if(m + f < 30) out.println("F");
		}
		out.flush();
	}
}