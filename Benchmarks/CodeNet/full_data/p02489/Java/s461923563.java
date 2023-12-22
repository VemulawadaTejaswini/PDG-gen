import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = 1;
		while(a != 0){
			System.out.println("Case " + i + ": " + a);
			a = sc.nextInt();
			i = i + 1;
		}
		
	}
}