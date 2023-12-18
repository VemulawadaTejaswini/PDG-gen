package begginer085;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	int a[];
	Integer b[];
	
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();
		a = new int[N];
		b = new Integer[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(b, Collections.reverseOrder()); //降順
		
		int aMax = 0;
		for(int i=0; i<N; i++) if(aMax < a[i]) aMax = a[i];
		
		int dam = 0, count = 0;
		for(int i=0; i<N; i++) {
			if(b[i] > aMax) { //投げるより振る方が得の場合ある
				dam += b[i];
				count++;
			}
			if(dam >= H) { //投げて終わり
				System.out.println(count);
				return;
			}
		}
		
		//投げて終わらない
		System.out.println(count+(H-dam+aMax-1)/aMax);
	}
}
