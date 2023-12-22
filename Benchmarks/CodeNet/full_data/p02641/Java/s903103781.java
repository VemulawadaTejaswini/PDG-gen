import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int ans=102;
		int re=0;
		List<Integer> p = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			p.add(sc.nextInt());
		}
		for(int i=101;i>=0;i--) {
			if(!p.contains(i)) {
				if(ans>=Math.abs(x-i)) {
					ans=Math.abs(x-i);
					re = i;
				}
			}
		}
		System.out.println(re);
	}
}