import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if( (1<=a) && (b<=1000000000) ){
			System.out.println(a/b + " " + a%b + " " + (float)a/b);
		}
	}
}