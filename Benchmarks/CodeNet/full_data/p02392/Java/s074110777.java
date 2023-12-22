import java.util.Scanner;
public class Main {
	void range(){
		int a,b,c;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		if(a < b && b < c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
	public static void main (String args[]){
		Main m1 = new Main();
		m1.range();
	}
}