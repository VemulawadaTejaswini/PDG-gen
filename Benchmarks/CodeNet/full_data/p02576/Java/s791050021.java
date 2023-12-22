import java.awt.*;
import java.io.*;
import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new TestA().doIt();
	}
	class TestA{
		void doIt() {
			int N = Integer.parseInt(sc.next());
			int X = Integer.parseInt(sc.next());
			int T = Integer.parseInt(sc.next());
			int ans = (N / X) * T;
			if(N % X > 0)ans = ans + T;
			System.out.println(ans);
		}
	}
}