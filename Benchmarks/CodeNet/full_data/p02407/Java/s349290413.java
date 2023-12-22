import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int [] box = new int [n];
		for(int a = n-1; 0 <= a; a--){
			box[a] = scanner.nextInt();
		}
			for(int a = 0; a <= n - 1; a++){
			System.out.print(box[a]+" ");
			}
		System.out.println();
	}
}