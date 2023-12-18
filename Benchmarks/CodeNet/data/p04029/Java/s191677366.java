import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new A().doIt();
//		new B().doIt();
//		new C().doIt();
//		new D().doIt();
	}
	class A{
		void doIt() {
			int N = sc.nextInt();
			int sum = 0;
			for(int i = 1;i <= N;i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		}
	}
	class B{
	}
	class C{
	}
	class D{
	}
}
