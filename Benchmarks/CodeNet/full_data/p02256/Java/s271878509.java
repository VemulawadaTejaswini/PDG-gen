import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		scan.close();
		System.out.println(gcd(a,b));
		
	}
	public static int gcd(int x, int y){
		if(y==0){
			return x;
		}
		else if(x>=y){
			x=gcd(y,x%y);
		}
		else{
			x=gcd(x,y%x);
		}
		return x;
	}
}
