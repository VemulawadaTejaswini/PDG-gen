import java.util.*;
import java.util.Map.Entry;
 
 

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int N;
   public static void main(String[] args) {
   
       Scanner sc = new Scanner(System.in);
       N = sc.nextInt();
       boolean[] visited2 = new boolean[N*N];
       int[] first = new int[N];
       int[] weight;
  	   List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
  	   List<ArrayList<Integer>>  list2 = new ArrayList<ArrayList<Integer>>();
       for(long i=0;i<N*N;i++)list.add(new ArrayList<Integer>());
       for(long i=0;i<N*N;i++)list2.add(new ArrayList<Integer>());
       for(int i=0;i<N;i++) {
           int pre=0;
       	for(int j=0;j<N-1;j++){
       		int a=sc.nextInt();
       		int tmp=Math.min(a-1, i)*N+Math.max(a-1, i);
       		if(pre!=0) {
               	list.get(pre).add(tmp);      	
               	list2.get(tmp).add(pre);
               	visited2[tmp]=true;
       		} else {
           		first[i]=tmp;
       		}
       		pre=tmp;
       	}
       }
       Arrays.sort(first);
		int max=0;

		LinkedList<Integer> queue = new LinkedList<Integer>();
	    int[] tcnt= new int[N*N];
	    weight=new int[N*N];
		int p=-1;
		for(int i=0;i<first.length;i++) {
			if(p!=first[i]&&visited2[first[i]]==false) {
		       	queue.add(first[i]);
		       	queue.add(1);				
			}
			p=first[i];
       }
		
		int cnt=0;
		boolean[] visited = new boolean[N*N];
   	while(!queue.isEmpty()) {
   		int n = queue.poll();
   		int w = queue.poll();
   		if(w!=1)cnt++;
   		tcnt[n]++;
		if(tcnt[n]<list2.get(n).size())continue;
   		if(visited[n]) {
   			System.out.println(-1);
   			return;
   		}
		if(weight[n]<w)weight[n]=w;
   		for(int i:list.get(n)) {
   			queue.add(i);
   			queue.add(w+1);
   			max=Math.max(max, w+1);
   		}
   		visited[n]=true;
   	}
   	
   	if(cnt!=N*(N-2))max=-1;
    System.out.println(max);  	
              		
   }

}