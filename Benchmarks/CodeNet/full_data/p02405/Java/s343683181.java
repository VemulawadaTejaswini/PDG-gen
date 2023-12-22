import java.util.*;

public class Main {

	public static void main(String[] args) {
		int i1, i2, counter1, counter2;
		Scanner sc = new Scanner(System.in);
		while (true) {
			i1 = sc.nextInt();
			i2 = sc.nextInt();
			counter1 = 0;
			counter2 = 0;
			if (i1 == 0 && i2 == 0)
				break;
			for (int i = 0; i < i1; i++) {
				for (int j = 0; j < i2; j++){
					counter1++;
					if(counter2 % 2 == 1){
						if(counter1 % 2 == 1)
							System.out.print(".");
						else
							System.out.print("#");
					}
					else{
						if(counter1 % 2 == 1)
							System.out.print("#");
						else
							System.out.print(".");
					}
				}
				System.out.println("");
				counter2++;
				counter1 = 0;
			}
			System.out.println("");
		}
	}
}