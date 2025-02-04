import java.util.Scanner;
 
public class Main {
    public static int N;
    public static int M;
    public static int[] p;
    public static int[] rank;
    public static int[] w;
 
    public static boolean same(int a, int b) {
        return findSet(a) == findSet(b);
    }
 
    public static void unite(int a, int b, int k) {
        int i = findSet(a);
        int j = findSet(b);
	k -= w[b] - w[a];
	
        if (i == j){
	    return;
	}
        if (rank[i] > rank[j]){
            p[j] = p[i];
	    w[j] = k;
        } else {
            p[i] = p[j];
	    w[i] = -k;
            if(rank[i] == rank[j]){
            rank[j]++;
            }
        }	
    }
 
    public static int findSet(int i) {
       if(p[i] == i){ 
           return i;
        }else{
          return p[i] = findSet(p[i]);
        }
    }
 
    public static void DisjointSet() {
        p = new int[N];
        rank = new int[N];
	w = new int[N];
 
        for (int i = 0; i < N; i++) {
            p[i] = i;
            rank[i] = 0;
	    w[i] = 0;
        }
    }
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
	while(true){   
	    N = scanner.nextInt();
	    DisjointSet();
	    M = scanner.nextInt();
	    if(N==0 & M == 0) break;
	    
	    for (int i = 0; i < M; i++) {
		if(scanner.next().equals("!")){
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int k = scanner.nextInt();
		    
		    a--;
		    b--;
		    unite(a, b, k);
		}else{
		    if(same(a,b)==false){
			System.out.println("UNKNOWN");
		    }else{
			System.out.println(w[b]-w[a]);
		    }
		}
	    }
	}	
    }
}
 
    public static int findSet(int i) {
       if(p[i] == i){ 
           return i;
        }else{
          return p[i] = findSet(p[i]);
        }
    }
 
    public static void DisjointSet() {
        p = new int[N];
        rank = new int[N];
	w = new int[N];
 
        for (int i = 0; i < N; i++) {
            p[i] = i;
            rank[i] = 0;
	    w[i] = 0;
        }
    }
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
	while(true){   
	    N = scanner.nextInt();
	    DisjointSet();
	    M = scanner.nextInt();
	    if(N==0 & M == 0) break;
	    
	    for (int i = 0; i < M; i++) {
		if(scanner.next().equals("!")){
		    int a = scanner.nextInt();
		    int b = scanner.nextInt();
		    int w = scanner.nextInt();
		    
		    a--;
		    b--;
		    unite(a, b, w);
		}else{
		    if(same(a,b)==false){
			System.out.println("UNKNOWN");
		    }else{
			System.out.println(w[b]-w[a]);
		    }
		}
	    }
	}	
    }
}