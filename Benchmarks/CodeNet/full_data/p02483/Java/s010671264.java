import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b<c){
			System.out.printf("%d %d %d?\n", a, b, c);
		}else if(a<c<b){
			System.out.printf("%d %d %d?\n", a, b, c);
		}
		else if(b<a<c){
			System.out.printf("%d %d %d?\n", b, a, c);
		}
		else if(b<c<a){
			System.out.printf("%d %d %d?\n", b, c, a);
		}
		else if(c<a<b){
			System.out.printf("%d %d %d?\n", c, a, b);
		}
		else if(c<b<a){
			System.out.printf("%d %d %d?\n", c, b, a);
		}

	
		}
	}