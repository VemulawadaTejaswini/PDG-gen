import java.util.Scanner;


public class Main{
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int tmp;
		sc.close();
		if(a > b){
			tmp = a;
			a = b;
			b = tmp;
		}
		if(b > c){
			tmp = b;
			b = c;
			c = tmp;
		}
		if(a > c){
			tmp = a;
			a = c;
			c = tmp;
		}
		System.out.println(a +" "+ b +" "+ c);
	}
}