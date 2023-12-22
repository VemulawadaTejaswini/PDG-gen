import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int str1 = scan.nextInt();
		int str2 = scan.nextInt();
		
		while(str1 != 0 && str2 != 0){
			for(int i = 0; i < str1; i++){
				for(int j = 0; j < str2; j++){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
			str1 = scan.nextInt();
			str2 = scan.nextInt();

		}
		
	}
}