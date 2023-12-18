import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int m1 = sc.nextInt();
		int d1 = sc.nextInt();
		int m2 = sc.nextInt();
		int d2 = sc.nextInt();
		
		if (m1 == m2) { 
			System.out.print("0");
		}else{
			System.out.print("1");
		}
	}
}