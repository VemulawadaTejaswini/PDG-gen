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
			int N = sc.nextInt();
			int cnt = 0;
			for(int i = 1;i < N;i++) {
				cnt = cnt + ((N - 1) / i);
			}
			System.out.println(cnt);
		}
	}
}