import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new A().doIt();
	}

	class A {
		void doIt() {
			String str = sc.next();
			if(str.length() < 4){
				System.out.println("No");
			}else{
				if(str.substring(0,4).equals("YAKI")) System.out.println("Yes");
				else System.out.println("No");
			}
		}
	}
}
