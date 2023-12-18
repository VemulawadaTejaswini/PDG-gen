
import java.io.*;
import java.util.*;

class MyComparator implements Comparator{
	public int compare(Object arg0, Object arg1){
		long x = (long)arg0;
		long y = (long)arg1;

		if(x < y){
			return -1;
		}
		else if(x > y){
			return 1;
		}
		else{
			return 0;
		}
	}
}

class Main{
    public static final Comparator Comp = new MyComparator();
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[x];
        long[] b = new long[y];
        long[] c = new long[z];
        for(int i=0;i<x;i++){
        	a[i] = sc.nextLong();
        }
        for(int i=0;i<y;i++){
        	b[i] = sc.nextLong();
        }
        for(int i=0;i<z;i++){
        	c[i] = sc.nextLong();
        }
        PriorityQueue pq = new PriorityQueue(k,Comp);
        for(int i=0;i<x;i++){
        	for(int j=0;j<y;j++){
        		long w = a[i] + b[j];
        		if(pq.size()<k){
        			pq.add(w);
        		}
        		else if(w>(long)pq.peek()){
        			pq.poll();
        			pq.add(w);
        		}
        	}
        }
        ArrayList<Object> list = new ArrayList<Object>();
        int size = pq.size();
        for(int i=0;i<size;i++){
        	list.add(pq.poll());
        }

        pq.clear();
        for(int i=0;i<list.size();i++){
        	for(int j=0;j<z;j++){
        		long w = (long)list.get(i) + c[j];
        		if(pq.size()<k){
        			pq.add(w);
        		}
        		else if(w>(long)pq.peek()){
        			pq.poll();
        			pq.add(w);
        		}
        	}
        }
        list.clear();
        size = pq.size();
        for(int i=0;i<size;i++){
        	list.add(pq.poll());
        }

        for(int i=list.size()-1;i>=0;i--){
        	System.out.println(list.get(i));
        }
    }
}