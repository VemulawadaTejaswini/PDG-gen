
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X[] = new int[3];
		for(int i=0;i<3;i++)X[i]=sc.nextInt();
		Arrays.sort(X);
		int ans = X[2]*10+X[1]+X[0];
		System.out.println(ans);
	}
}
