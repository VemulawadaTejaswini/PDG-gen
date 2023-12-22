import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;
			calc(n, m);
		}
	}
	public void calc(int n, int m){
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < n; i++){
			int d = sc.nextInt();
			int p = sc.nextInt();
			for(int j = 0; j < d; j++){
				list.add(p);
			}
		}
		if(list.size() <= m) System.out.println(0);
		else{
			Collections.sort(list);
			Collections.reverse(list);
			int sum = 0;
			for(int i = m; i < list.size(); i++){
				sum = sum + list.get(i);
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}