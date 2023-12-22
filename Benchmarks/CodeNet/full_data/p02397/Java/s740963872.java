import java.util.Scanner;

public class Main {	
	
	void main() {
		try(Scanner sc = new Scanner(System.in)){
			for(;;) {
				int x = sc.nextInt();
				int y = sc.nextInt();
					if(x == 0 && y == 0)break;
					if ( x < y ){
						System.out.println(x + " " + y);
					} else {
						System.out.println(y + " " + x);
					}
			}
		}
	}

	public static void main(String[] args)  {
		new Main() . main();
	}
	
}

