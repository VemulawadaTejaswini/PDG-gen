import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int hoz;
		a = sc.nextInt(); //4
		b = sc.nextInt(); //3
		c = sc.nextInt(); //1
		if(a>b){
			hoz = a;
			a = b; 
			b = hoz; 
			if(b>c){
				hoz = b;
				b = c; 
				c = hoz; 
				if(a>b){
					hoz = a;
					a = b;
					b = hoz;
				}
			}
		}else if(b>c){
			hoz = b;
			b = c;
			c = hoz;
			if(a>b){
				hoz = a;
				a = b;
				b = hoz;
			}
		}
		System.out.println(a+" "+b+" "+c);
	}
}