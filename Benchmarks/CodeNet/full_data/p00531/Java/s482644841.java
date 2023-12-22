import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();
		int x,y;
		
		x = p * a;
		if(p < c)
			y = b;
		else
			y = b + (p - c) * d;
		
		System.out.println(Math.min(x, y));
		
		sc.close();
	}
}