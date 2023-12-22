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
			int D = sc.nextInt();
			int T = sc.nextInt();
			int S = sc.nextInt();
			int ans = (int)Math.ceil(1.0*D / S);
			if(ans <= T) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}