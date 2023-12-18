import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int[] a = new int[N-1];
        int[] b = new int[N-1];
        int[] ans = new int[N];
        int K = 0;
        for(long i=0;i<N;i++)list.add(new ArrayList<Integer>());
		for(int i=0;i<N-1;i++){
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
			list.get(a[i]).add(b[i]);
			list.get(b[i]).add(a[i]);
		}
		
		for(int i=0;i<N;i++) {
			K=Math.max(K, list.get(i).size());
		}
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		queue.add(1);
		boolean[] visited = new boolean[N];
		while(!queue.isEmpty()) {
			int now = queue.poll();
			int num = queue.poll();
			int sili = 1;
			visited[now]=true;
			ans[now]=num;
//			System.out.println("aaa"+list.get(now).size());
			for(int i=0;i<list.get(now).size();i++) {
//				System.out.println("aaa"+list.get(now).size());
				if(visited[list.get(now).get(i)]==true)continue;
				if(sili==num) {
					sili++;
				}
				queue.add(list.get(now).get(i));
				queue.add(sili);
				sili++;
			}
			sili = 1;
//			System.out.println("aaa"+sili);
		}
		
		
	    System.out.println(K);
	    for(int i=0;i<N-1;i++) {
		       System.out.println(ans[Math.max(a[i], b[i])]);			
		}
    }
}