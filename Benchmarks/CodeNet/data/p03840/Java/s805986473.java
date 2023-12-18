import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[7];
		for(int i=0; i<7; i++)
			a[i] = sc.nextInt();
		
		long ans = 0;
		
		ans += a[0]/2*2;
		ans += a[1];
		ans += a[3]/2*2;
		ans += a[4]/2*2;
		if(a[0]%2==1 && a[3]%2==1 && a[4]%2==1)
			ans += 3;
		
		System.out.println(ans);
		sc.close();
	}
}
