import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int p3 = sc.nextInt();
		int j1 = sc.nextInt();
		int j2 = sc.nextInt();
		int mp = p1;
		int mj = j1;
		
		if(mp > p2){
			mp = p2;
		}
		if(mp > p3){
			mp = p3;
		}
		
		if(mj > j2){
			mj = j2;
		}
		
		System.out.println(mp + mj - 50);
	}
}