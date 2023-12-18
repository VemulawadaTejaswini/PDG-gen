import java.io.*;
import java.util.*;
public class Main{
	static int count[];
	static List<List<Integer>> ad;
    public static void main(String[] args)throws IOException{
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int q = sc.nextInt();
    	count= new int[n];
    	ad = new ArrayList<>();
    	for(int i=0;i<n;i++){
    		ad.add(new ArrayList<Integer>());
    	}
    	for(int i=0;i<n-1;i++){
    		int a = sc.nextInt()-1;
    		int b = sc.nextInt()-1;
    		ad.get(a).add(b);
      	}
      	for(int i=0;i<q;i++){
      		int p = sc.nextInt() - 1;
            int x = sc.nextInt();
            count[p] += x;
      	}
      	dfs(0);
      	for (int i : count) {
            System.out.println(i);
        }

    }
    static void dfs(int v) {
        for (Integer i : ad.get(v)) {
            count[i] += count[v];
            dfs(i);
        }
    }
}



