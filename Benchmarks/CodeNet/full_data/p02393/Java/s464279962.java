import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
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
		if(a > b){
			tmp = a;
			a = b;
			b = tmp;
		}
		System.out.println(String.format("%d %d %d",a,b,c));
	}
}

