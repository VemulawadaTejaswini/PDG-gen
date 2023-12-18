import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<String> sAry = new ArrayList<String>();
		int a[] = new int[N];
		Arrays.fill(a, 1);
		String s;
		for(int i=0; i<N; i++) {
			s = sc.next();
			if(!sAry.contains(s)) sAry.add(s);
			else {
				for(int j=0; j<sAry.size(); j++) {
					if(s.equals(sAry.get(j))) {
						a[j]++;
						break;
					}
				}
			}
		}

		int M = sc.nextInt();
		for(int i=0; i<M; i++) {
			s = sc.next();
			for(int j=0; j<sAry.size(); j++) {
				if(s.equals(sAry.get(j))) {
					a[j]--;
					break;
				}
			}
		}
		sc.close();

		int max = -1;
		for(int i=0; i<a.length; i++) max = Math.max(max, a[i]);

		if(max < 0) System.out.println(0);
		else System.out.println(max);
	}

}