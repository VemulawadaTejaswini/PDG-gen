import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int temp;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b){
			temp = a;
			a = b;
			b = temp;
		}
		if(b > c){
			temp = b;
			b = c;
			c = temp;
		}
		if(a > b){
			temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println(a + " " + b + " " + c);
	}
}