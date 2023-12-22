import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		Map<Integer,Long> H = new HashMap<>();
		Set<Integer> s = new HashSet<>();
		Set<Integer> none = new HashSet<>();
		for(int i = 1; i <= N; i++){
			H.put(i,sc.nextLong());
		}
		for(int i = 0; i < M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			none.add(a);
			none.add(b);
			if(H.get(a) - H.get(b) > 0){
				s.remove(b);
				s.add(a);
			}else if(H.get(b) - H.get(a) > 0){
				s.remove(a);
				s.add(b);
			}
		}
		System.out.print(s.size() + (N -none.size()));
	}
}