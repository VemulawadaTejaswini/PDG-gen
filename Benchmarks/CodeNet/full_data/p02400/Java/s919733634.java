import java.util.Scanner;
import java.lang.Math;
public class Main {
	void circle(){
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		System.out.println(Math.PI*(double)(r*r) + " " + Math.PI * (double)(r*2));
	}
	public static void main(String args[]){
		Main m = new Main();
		m.circle();
	}
}