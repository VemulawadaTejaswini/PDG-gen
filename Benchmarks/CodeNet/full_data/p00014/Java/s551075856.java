import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		long s = 0;
		for(int i = d; i + d < 600; i+= d){
			s += f(i) * d;
		}
		System.out.println(s);
	}
	
	static long f(int x){
		return (long)x*x;
	}
}