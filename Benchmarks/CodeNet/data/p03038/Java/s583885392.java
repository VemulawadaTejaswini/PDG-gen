import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt(),n_t=n;
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<n;i++) array.add(sc.nextInt());
		for(int i=0;i<m;i++) {
			int b=sc.nextInt(), c=sc.nextInt();
			n_t+=b;
			for(int j=0;j<b;j++) array.add(c);
		}
		sc.close();
		Collections.sort(array);
		long ans=0;
		for(int i=n_t-1;i>=n_t-n;i--) ans+=array.get(i);
		System.out.println(ans);
	}
}