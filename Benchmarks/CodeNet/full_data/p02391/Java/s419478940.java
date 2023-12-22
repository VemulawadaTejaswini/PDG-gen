import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		sme(a, b);

	}

	static void sme(int a , int b){
		if(a<b){
			System.out.println("a<b");
		}else if(a>b){
			System.out.println("a>b");
		}else{
			System.out.println("a==b");
		}
	}
}