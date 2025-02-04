import java.awt.geom.*;
import java.io.*;
import java.util.*;
public class Main {
	
	boolean [] isprime;
	ArrayList<Integer> list;
	int MAX = 100000;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		init();
		while(true){
			int m = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if((m|a|b) == 0)break;
			double ab = (double)a / b;
			int len = list.size();
			int max = 0;
			int maxp = -1, maxq = -1;
			for(int i = 0; i < len; i++){
				int p = list.get(i);
				if(p * 2 > m) break;
				for(int j = 0; j <= i; j++){
					
					int q = list.get(j);
					if(p * q <= m && (double)q / p <= 1.0 && (double) q / p >= ab){
						if(p * q > max){
							max = p * q;
							maxp = p;
							maxq = q;
						}
					}
				}
			}
			System.out.println(maxq + " " + maxp);
		}
	}
	
	private void init() {
		isprime = new boolean[MAX + 1];
		list = new ArrayList<Integer>();
		Arrays.fill(isprime, true);
		isprime[0] = false;
		isprime[1] = false;
		for(int i = 2; i <= MAX; i++){
			if(isprime[i]){
				list.add(i);
				for(int j = i + i; j <= MAX; j += i){
					isprime[j] = false;
				}
			}
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}