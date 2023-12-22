import java.util.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		long K = Long.parseLong(s.next());
		int[] A = new int[N + 1];
		for(int i = 1; i < N + 1; i++) {
			A[i] = s.nextInt();
		}
		
		List<Integer> list = new LinkedList<Integer>();
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
		
		int size = list.size();
		
		int count = (int)((K - loopStart)%(size - loopStart));
		
		if(K < loopStart) {
			System.out.println(list.get((int)K));
		}else {
			System.out.println(list.get(loopStart + count));
		}
    }
}