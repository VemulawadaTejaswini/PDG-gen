import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Telepoter();
		
	}
	
	
	private static void Telepoter() {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		long K = Long.parseLong(s.next());
		int[] A = new int[N + 1];
		for(int i = 1; i < N + 1; i++) {
			A[i] = s.nextInt();
		}
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(1));
		int loopStart = 0;
		int now = 1;
		for(int i = 1; i < N + 1; i++) {
			now = A[now];
			if(list.contains(Integer.valueOf(now))) {
				loopStart = list.indexOf(Integer.valueOf(now));
				break;
			}
			list.add(Integer.valueOf(now));
		}
		
		int count = (int)((K - loopStart)%3);
		
		int size = list.size();
		
		if(K < loopStart) {
			System.out.println(list.get((int)K));
		}else {
			System.out.println(list.get(loopStart + count));
		}
			
	}