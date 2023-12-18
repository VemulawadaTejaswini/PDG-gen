import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] x = sc.next().toCharArray();
		int check = 0;



		for (int i = 0; i < x.length; i++) {
			if (x[i] == 'C' && check==0) {
				check = 1;
			}

			if (x[i] == 'F' && check==1){
				check = 2;
				break;
			}
		}


		if (check == 2) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		sc.close();
	}

}
