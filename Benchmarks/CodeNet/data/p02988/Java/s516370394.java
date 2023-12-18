import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
  	
	void b() {
		int n = sc.nextInt();
		int[] p = new int[n];
		int cnt = 0;
		for(int i = 0;i < n;i ++) {
			p[i] = sc.nextInt();
		}
		for(int i = 1;i < n - 1;i ++) {
			ArrayList<Integer> part = new ArrayList<>();
			part.add(p[i-1]); 
			part.add(p[i]);
			part.add(p[i+1]);
			part.sort(null);
			if(p[i] == part.get(1)) cnt++;
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		new Main().b();
	}

}



