import java.util.Scanner;

public class Main {
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++){
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			System.out.println(isRightTriangle(b,c,d));
		}
		sc.close();
	}
	
	public static String isRightTriangle(int a, int b ,int c){
		if(a>b){
			int k = a;
			a = b;
			b = k;
		}
		if(b>c){
			int k = b;
			b = c;
			c= k;
		}
		
		if(c*c == a*a+b*b)
			return "YES";
		else
			return "NO";
	}

}
