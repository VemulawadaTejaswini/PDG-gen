import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int tmp;
		for (int i=0; i++; i<2 ) {
			if(a > b){
				tmp = a;
				a = b;
				b = tmp;
			}
			if(b > c){
				tmp =b;
				b = c;
				c = tmp;
			}
			
		}

		System.out.pritf("%d %d %d\n",a,b,c);

	}
}