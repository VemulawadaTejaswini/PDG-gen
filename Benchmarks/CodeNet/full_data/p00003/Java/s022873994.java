import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();

		int a, b, c;
		for(int i = 0; i < dataset; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(judgeTriangle(a, b, c)) System.out.println("YES");
			else System.out.println("NO");
		}
		sc.close();
	}
	
	static boolean judgeTriangle(int a, int b, int c) {
		int da = a * a;
		int db = b * b;
		int dc = c * c;
		if(da + db == dc) return true;
		else if(db + dc == da) return true;
		else if(dc + da == db) return true;
		else return false;
	}
}