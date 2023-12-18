import java.util.Scanner;

class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if( a > b ){
			System.out.print("GREATER");
		}else if( a == b ){
			System.out.print("EQUAL");
		}else if( a < b ){
			System.out.print("LESS");
		}

		sc.close();
	}
}