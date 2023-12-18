import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>a=new ArrayList<Integer>();
		ArrayList<Integer>b=new ArrayList<Integer>();
		for(int i = 0; i < n; i ++) {
			a.add(sc.nextInt());
			b.add(sc.nextInt());
		}
		sc.close();
		long r = 0;
		int max, index;
		boolean teban = true;
		for(int i = 0; i < n; i ++) {
			max = a.get(0) + b.get(0);
			index = 0;
			for(int j = 0; j < a.size(); j ++) {
				if(a.get(j) + b.get(j) >= max) {
					if(a.get(j) >= a.get(index)) {
						max = a.get(j) - b.get(j);
						index = j;
					}
				}
			}
			if(teban) {
				r += a.get(index);
			}else {
				r -= b.get(index);
			}
			a.remove(index);
			b.remove(index);
			teban = !teban;
		}
		System.out.println(r);
	}
}