import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int tmp = 0;

		while(a <= b){

			if(c%a ==0){
				tmp++;
			}
			a++;
		}
		scan.close();
		System.out.println(tmp);
	}

}