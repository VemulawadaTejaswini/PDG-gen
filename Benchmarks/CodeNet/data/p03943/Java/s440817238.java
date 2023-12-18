import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int c3 = sc.nextInt();

		int total = c1+c2+c3;
		if( c1 > (c2 + c3)){
			System.out.println("No");
		}else if( c2 > (c1 + c3)){
			System.out.println("No");
		}else if (c3 > (c1+c2)){
			System.out.println("No");
		}else if(total%2 != 0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}

		sc.close();
	}

}