import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=0;i<a;i++){
			a+=i;
		}
		System.out.println(a);
	}
}