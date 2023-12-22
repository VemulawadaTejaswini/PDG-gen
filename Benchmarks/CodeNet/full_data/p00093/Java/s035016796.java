import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;
		boolean exist;

		for(;;){
			a = sc.nextInt();
			b = sc.nextInt();
			if(a == 0) break;
			exist = false;

			for(int i = a; i <= b; i++){
				if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
					System.out.println(i);
					exist = true;
				}
			}

			if(exist == false) System.out.println("NA");
		}
	}
}