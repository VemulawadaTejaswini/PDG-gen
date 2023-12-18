import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int h[] = new int[n];
		for(int i = 0; i < n; i++) {
			h[i] = scan.nextInt();
		}
		scan.close();
		
		ArrayList<Integer> s = new ArrayList<>();
		ArrayList<Integer> f = new ArrayList<>();
		
		int count = 0;
		boolean check = true;
		do{
			if(h[0] > 0) {
				s.add(0);
			}
			for(int i = 0; i < n - 1; i++) {
				if(h[i] == 0 && h[i+1] > 0) {	//花の連続開始位置の記録
					s.add(i+1);
				}
				if(h[i] > 0 && h[i+1] == 0) {	//花の連続終了位置の記録
					f.add(i);
				}
			}
			if(s.size() > f.size()) {	//終了位置が花の最後のとき、それは記録されてないので
				f.add(n - 1);
			}
			
			if(s.isEmpty()) {			//花の高さがすべて0ならsは空なので、終了判定
				check = false;
			}
			
			for(int i = 0; i < s.size(); i++) {
				downFlower(s.get(i), f.get(i), h);
				count += 1;
			}
			
			s.clear();
			f.clear();
		}while(check);
		
		System.out.println(count);
		

	}
	
	public static void downFlower(int s, int f, int h[]) {
		for(int i = s; i < f + 1; i++) {
			h[i] -= 1;
		}
	}

}
