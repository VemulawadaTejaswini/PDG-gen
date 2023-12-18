import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		sc.close();
		if(k==1) System.out.println(0);
		else System.out.println(n-k);
	}
}
