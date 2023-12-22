import java.util.Scanner;
  
public class Main {
    public static int N;
    public static int M;
    public static int[] p;
    public static int[] rank;
    public static int[] weight;
 
    public static boolean same(int x, int y) {
        return findSet(x) == findSet(y);
    }
  
    public static void unite(int x, int y, int w) {
        int i = findSet(x);
        int j = findSet(y);
       
 
        if (i == j){
	    return;
	}
        if (rank[i] > rank[j]){
            p[j] = i;	   
            weight[j] =  w - weight[y] + weight[x];
        } else {
            p[i] = j;
            weight[i] =  -w - weight[x] + weight[y];
            if(rank[i] == rank[j]){
		rank[j]++;
            }
        }   
    }
  
    public static int findSet(int i) {
	if(p[i] == i){ 
	    return i;
        }else{
	    int tmp = findSet(p[i]);
	    weight[i] += weight[p[i]];
	    return p[i] = tmp;
        }
    }
  
    public static void DisjointSet() {
        p = new int[N];
        rank = new int[N];
        weight = new int[N];
  
        for (int i = 0; i < N; i++) {
            p[i] = i;
            rank[i] = 0;
            weight[i] = 0;
        }
    }
  
  
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
	    N = scanner.nextInt();
	    M = scanner.nextInt();
 
	    if(N==0 && M==0){
		break;
	    }
  
	    DisjointSet();
 
	    for (int i = 0; i < M; i++) {
		String c = scanner.next();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		a--; b--; 
         
		if(c.equals("!")){
		    int w = scanner.nextInt();
		    unite(a, b, w);
		}else{ 
		    if(same(a,b)){
			System.out.println(weight[b] - weight[a]);
		    }else{
			System.out.println("UNKNOWN");
		    }
		}
	    }
	}
       
    }
}