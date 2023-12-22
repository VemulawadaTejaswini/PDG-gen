import java.util.Scanner;
class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a,b,c;
			a = scan.nextInt();
			b = scan.nextInt();
                        c = 2*(a+b);
			System.out.println(a*b + c);
			scan.close();
		
	}
}