import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int c = numOfCase(sc.nextInt(), sc.nextInt(), sc.nextInt());
			System.out.println(c > 3? "YES": "NO");
		}
		sc.close();
	}
	
	static int numOfCase(int c1, int c2, int c3) {
		int sum = (c1 + c2 <= 10)? 10: (20 - (c1 + c2));
		int n = 0;
		if(c1 <= sum) n++;
		if(c2 <= sum) n++;
		if(c3 <= sum) n++;
		return sum - n;
	}
}