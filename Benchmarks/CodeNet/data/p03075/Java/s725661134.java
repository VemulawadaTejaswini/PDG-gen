import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		
		if(ht(a,e,k)) {
			System.out.println("yey!");
		}else {
			System.out.println(":(");
		}
	}
	public static boolean ht(int a,int e,int k) {
		int distance = e - a;
		return distance<=k;
	}
}

