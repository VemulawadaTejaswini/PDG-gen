import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int day = sc.nextInt();

		int before = sc.nextInt();

		int after = sc.nextInt();

		if((after - before) < 0) {
			System.out.println("delicious");
		}else if((after - before) >= (day+1)){
			System.out.println("dangerous");
		}else{
			System.out.println("safe");
		}



	}

}
