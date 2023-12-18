import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i = 0; i < n; ++i) 
			a[i] = sc.nextInt();
		for(int i = 0; i < n; ++i)
			b[i] = sc.nextInt();
		sc.close();
		String ans[] = {"Yes", "No"};
		int an = 0;
		long tmp = 0, tmp3 = 0;
		for(int i = 0; i < n; ++i) {
			int tmp2 = b[i] - a[i];
			if(tmp2 < 0)tmp2 = 0;
			tmp3 += tmp2;
			tmp += (long)tmp2;
		}
		if(tmp < 0)an = 1;
		else {
			if(tmp < tmp3)an = 1;
		}
		System.out.println(ans[an]);
	}

}
