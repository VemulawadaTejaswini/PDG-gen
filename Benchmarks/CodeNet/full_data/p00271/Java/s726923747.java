import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a, b;
		int ans[] = new int[7];
		for(int i = 1; i < 7; i++){
			a = scan.nextInt();
			b = scan.nextInt();
			
			ans[i] = a - b;
		}
		for(int i = 1; i < 7; i++){
			System.out.println(ans[i]);
		}
	}
}