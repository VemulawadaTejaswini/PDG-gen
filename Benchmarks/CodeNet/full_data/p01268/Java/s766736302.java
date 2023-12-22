import java.util.*;
public class Main {
	
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int N = stdIn.nextInt();
			int P = stdIn.nextInt();
			if(N == -1 && P == -1) break;
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			int num = N;
			
			//せっきーの方法
			while(list.size() < 100) {
				boolean flag = true; //素数であると仮定
				if(N == 1) flag = false;
				for(int c = 2; c * c <= N; c++) {
					if(N % c == 0) {
						flag = false;
						break;
					}
				}
				if(flag) list.add(N);
				N++;
			}
			
			
			
			for(int r = 0; r < list.size(); r++) {
				if(list.get(r) > num) { 
					num = r; //添字にする 
					break;
				}
			}
			
			ArrayList<Integer> output = new ArrayList<Integer>();
			for(int r = num; r < list.size(); r++) {
				for(int c = r; c < list.size(); c++) {
					output.add(list.get(r) + list.get(c));
				}
			}
			Collections.sort(output);
			System.out.println(output.get(P - 1));
		}
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}