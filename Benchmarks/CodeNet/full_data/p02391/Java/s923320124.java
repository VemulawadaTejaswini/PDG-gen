import java.util.Scanner;

public class Main {
	void slore(){
		int a,b;
		Scanner s1 = new Scanner(System.in);
		a = s1.nextInt();
		b = s1.nextInt();
		if(a > b){
			System.out.println("a > b");
		}else if(a < b){
			System.out.println("a < b");
		}else{
			System.out.println("a == b");
		}
	}
	public static void main(String args[]){
		Main m1 = new Main();
		m1.slore();
	}
}