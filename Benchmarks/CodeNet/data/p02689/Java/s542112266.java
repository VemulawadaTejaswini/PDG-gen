import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		Map<Integer,List<Integer>> H = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		Set<Integer> none = new HashSet<>();
		for(int i = 1; i <= N; i++){
			int h = sc.nextInt();
			list.add(h);
			H.put(i,new ArrayList<Integer>(Arrays.asList(-99999)));
		}
		for(int i = 0; i < M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			none.add(a);
			none.add(b);
			H.get(a).add(list.get(a-1) - list.get(b-1));
			H.get(b).add(list.get(b-1) - list.get(a-1));
		}
		int count = 0;
		for(int i = 1; i <= N; i++){
			if(H.get(i).stream().max(Comparator.naturalOrder()).get() > 0){
				count++;
			}
		}
		System.out.print(count + (N -none.size()));
	}
}