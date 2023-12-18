import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String S = sc.next();
		//int N = sc.nextInt();
		//System.out.println();
		int N = sc.nextInt();
		int a1 = 2;
		int a2 = 1;
		int lucas = 0;
		for(int i=2; i<N;i++){
			lucas = a1 + a2;
			a1 = a2;
			a2 = lucas;
		}
			System.out.println(lucas);
	}
}
