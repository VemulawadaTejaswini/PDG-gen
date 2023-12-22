import java.util.*;

class Stack{
    private int[] stack = new int[150];
    private int tail=0;

    public void push(int x){
	if(tail<0)tail=0;
	stack[tail]=x;
	tail++;
    }

    public int pop(){
	tail--;
	return (tail>=0? stack[tail] : -1);
    }
}

class Main{

    final static int LEN=150;
    static int[][] graph = new int[LEN][LEN];
    static int[] d = new int[LEN];
    static int[] f = new int[LEN];
    static Stack stack = new Stack();

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
		//get end time
		for(int j=stack.pop(); j!=-1; j=stack.pop()){
		    //System.out.println("debug "+ i);
		    if(f[j]==0){
			time++;
			f[j]=time;
		    }
		}
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
	stack.push(i);

	//visit node
	for(int j=0; j<n; j++){
	    if(graph[i][j]!=0 && d[j]==0){
		dfs(j);
	    }
	}
    }
}