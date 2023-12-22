import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		m.start();
		m.flush();
	}

	private Scanner in;
	private double x = 0.0, y = 0.0, b = 90.0;
	public Main() {in = new Scanner(System.in);}
	private void start() {
		while(in.hasNext()) {
			String[] line = in.nextLine().split(",");
			solve( Integer.parseInt(line[0].trim()),
				   Integer.parseInt(line[1].trim()));
		}
	}
	private void solve(int m, int r) {
		x+=m*cos(b*PI/180.0);
		y+=m*sin(b*PI/180.0);
		b-=r;
	}
	private void flush() {
		System.out.printf("%d\n%d\n",(int)x,(int)y);
	}
}