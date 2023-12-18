import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Main main=new Main();
		main.run();
	}

	void run() {

		Scanner sc=new Scanner(System.in);

		int A=sc.nextInt();
		int B=sc.nextInt();

		if(A<=8 && B<=8) {
			System.out.println("Yay!");
		}else {
			System.out.println(":(");
		}


	}

}

