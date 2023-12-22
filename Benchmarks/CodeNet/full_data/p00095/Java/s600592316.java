import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ma=-1, mv=0;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt(), v = sc.nextInt();
			if(ma<0 || mv<v) {ma = a; mv = v;}
		}
		System.out.println(ma + " " + mv);
	}
}