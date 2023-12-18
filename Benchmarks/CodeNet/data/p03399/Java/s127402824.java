import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int max;
		int a= stdin.nextInt();
		int b= stdin.nextInt();
		int c= stdin.nextInt();
		int d= stdin.nextInt();
		if(a>b){
			max=+ b;
		}else{
			max=+ a;
		}
		if(c>d){
			max=+ d;
		}else{
			max=+ c;
		}
		System.out.println(max);

	}

}