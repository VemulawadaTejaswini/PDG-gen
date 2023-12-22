import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num = 999;
		for(int i = 1; num != 0; i++){
			num = sc.nextInt();
			System.out.println("Case " + i + ": " + num);
		}
		
	}
}