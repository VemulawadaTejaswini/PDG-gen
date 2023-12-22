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
			String S = sc.next();
			int length = S.length();
			if(S.substring(length-1, length).equals("s")) {
				System.out.println(S+"es");
			}else {
				System.out.println(S+"s");
			}
		}
	}
}