import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int count = 0;

		for(int i = a; i <= b; i++){
			if( c % i == 0){
				count++;
			}
		}
		System.out.println(count);
	}
}

