import java.util.*;

public class Main{
	public static void main(String[] args){
		//new Main().printHelloWorld();
		//System.out.println(new Main().ITP1_1_B(Integer.parseInt(new Scanner(System.in).next())));
		new Main().ITP1_1_C();
	}

	public void printHelloWorld(){
		System.out.println("Hello World");
	}

	public int ITP1_1_B(int x){
		return x*x*x;
	}

	public void ITP1_1_C(){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a*b + " " + 2*(a+b));
	}
}