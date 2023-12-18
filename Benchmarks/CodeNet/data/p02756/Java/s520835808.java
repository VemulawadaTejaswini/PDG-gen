import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		StringBuilder sbH = new StringBuilder();
		StringBuilder sbB = new StringBuilder();

		char a = scanner.nextLine().toCharArray()[0];
		int n  = Integer.parseInt(scanner.nextLine());
		int t  = 0;
		int t2 = 0;
		int f  = 0;


		for(int i = 0; i < n; i++) {

			String[] temp = scanner.nextLine().split(" ");


				t += Integer.parseInt(temp[0]);

				if(Integer.parseInt(temp[0]) == 2){

					f  		= Integer.parseInt(temp[1]);
					char c  = temp[2].toCharArray()[0];

					if(f == 1 && t % 2 == 0) {

						 sbH.append(c);

					}else if(f == 2 && t % 2 == 1) {

						 sbH.append(c);

					}else {
						 sbB.append(c);
					}
				}

		}

		if(t % 2 == 0) {

			System.out.println(sbH.reverse() .toString()+ a + sbB.toString());

		}else {
			System.out.println(sbB.reverse() .toString()+ a + sbH.toString());
		}

	}
}