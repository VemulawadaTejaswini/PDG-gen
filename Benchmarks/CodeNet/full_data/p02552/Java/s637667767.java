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
			int n = sc.nextInt();
			if(n == 0)System.out.println(1);
			else System.out.println(0);
		}
	}
}