import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	public void exec() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int cSqrt = (int)Math.sqrt(c);
		int divcnt = 0;
		int div = 0;
		for (int i=1; i<=cSqrt && i<=b; i++) {
			if(c%i == 0){
				if(a <= i && i <= b) divcnt++;
				div = c/i;
				if(i != div && a <= div && div <= b) divcnt++;
			}
		}
		out.println(divcnt);
		out.flush();
		input.close();
	}

	public static void main(String[] args) throws IOException {
		new Main().exec();
	}
}