import java.util.Scanner;


public class Main{
	public static void main(String[] args) {

		Input test = new Input();
		test.num();

		
	}
}

class Input{
	void num() {
		
		Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int x2 = sc.nextInt();
        System.out.print(x*x2);
        System.out.print(" ");
        System.out.println((x+x2)*2);

	}
}