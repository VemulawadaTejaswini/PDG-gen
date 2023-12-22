import java.util.Scanner;

class Main{
    final static int LEN = 105;
    public static void main(String args[]){
	int[][] graph = new int[LEN][LEN];
	int[] minCost = new int[LEN];
	int count=0;
	int v;
	Boolean[] used = new Boolean[LEN];

	Scanner in = new Scanner(System.in);

	//read
	int n = in.nextInt();
	for(int i=0; i<n; i++){
	    for(int j=0; j<n; j++){
		graph[i][j]=in.nextInt();
	    }
	}

	//make prim
	for(int i=0; i<n; i++){
	    minCost[i]=Integer.MAX_VALUE;
	    used[i]=false;
	}

	minCost[0]=0;

	while(true){
	    v = -1;
	    for(int i=0; i<n; i++){
		if(!used[i] && (v==-1 || minCost[i] < minCost[v]))v=i;
	    }

	    if(v==-1)break;
	    used[v]=true;
	    count+=minCost[v];

	    for(int i=0; i<n; i++){
		minCost[i]=Math.min(minCost[i], graph[v][i]);
	    }
	}

	//print
	System.out.println(count+7);
    }
}