import java.util.Scanner;

//Calculation of Area
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		System.out.printf("%.8f\n", sc.nextInt()*sc.nextInt()/3.305785);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}