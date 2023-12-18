import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int b = 0;
		int c = 0;
		for(int i = 0; i < N; i++){
			int a = sc.nextInt();
			if(a<S){
				b = S-a;
			}else{
				b = a-S;
			}
			if(i == 0){
				c = b;
			}else{
				c = gcd(c,b);
			}
		}
			System.out.println(c);
	}
}