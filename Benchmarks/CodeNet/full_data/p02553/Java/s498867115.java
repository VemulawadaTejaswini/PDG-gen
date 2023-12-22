import java.awt.*;
import java.io.*;
import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new TestB().doIt();
	}
	class TestB{
		void doIt() {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			long ac = a*c;
			long ad = a*d;
			long bc = b*c;
			long bd = b*d;
			long max = Math.max(ac, Math.max(ad, Math.max(bc, bd)));
			System.out.println(max);
		}
	}
}