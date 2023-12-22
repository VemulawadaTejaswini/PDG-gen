import java.util.*;

class Main{

    final static int LEN=150;
    static int[][] graph = new int[LEN][LEN];
    static int[] d = new int[LEN];
    static int[] f = new int[LEN];

    static int n, u, k;
    static int time;

    public static void main(String args[]){
	Scanner in = new Scanner(System.in);

	n=in.nextInt();
	for(int i=0; i<n; i++){
	    u=in.nextInt();
	    k=in.nextInt();
	    //read vartex informetion
	    for(int j=0; j<k; j++){
		graph[u-1][in.nextInt()-1]=1;
	    }
	}

	//DFS
	for(int i =0; i<n; i++){
	    if(d[i]==0){
		dfs(i);
	    }
	}

	//print
	for(int i=0; i<n; i++){
	    System.out.println( i+1 + " " + d[i] + " " + f[i]);
	}
    }

    static void dfs(int i){
	time++;
	d[i]=time;

	//visit node
	for(int j=0; j<n; j++){
	    if(graph[i][j]!=0 && d[j]==0){
		dfs(j);
	    }
	}
	//get end time
	time++;
	f[i]=time;
    }
}