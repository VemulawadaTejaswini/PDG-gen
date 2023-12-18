import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),days=s.nextInt();

		HashMap<Integer,ArrayList<Integer>> m=new HashMap<>();

		PriorityQueue<Integer> tasks=new PriorityQueue<>(Comparator.reverseOrder());

		for(int i=0;i<n;++i){
			int time=s.nextInt(),pay=s.nextInt();
			m.computeIfAbsent(time,o->new ArrayList<>()).add(pay);
		}


		long r=0;

		for(int i=1;i<=days;++i){
			ArrayList<Integer> l=m.get(i);
			if(l!=null)
				l.forEach(tasks::add);

			Integer task=tasks.poll();

			if(task!=null)
				r+=task;
		}

		System.out.println(r);
	}
}
