import java.util.*;
class Main{

    public static void main(String args[]){
	int w,n;
	int[][] Edge;
	int[] Ans;
	Scanner in = new Scanner(System.in);
	String[] s;

	w = in.nextInt();
	n = in.nextInt();
	Edge = new int[w+1][2];
	Ans = new int[w+1];
	for(int i=0;i<n;i++){
	    s = in.next().split(",");
	    Edge[i][0] = Integer.valueOf(s[0]).intValue();
	    Edge[i][1] = Integer.valueOf(s[1]).intValue();	   
	}
    
	int here;
	for(int i=1;i<=w;i++){
	    here = i;
	    for(int j=0;j<w;j++){
		if(Edge[j][0] == here)here = Edge[j][1];
		else if(Edge[j][1] == here)here = Edge[j][0];
	    }
	    Ans[here-1] = i;
	}

	for(int i=0;i<w;i++)System.out.println(Ans[i]);

    }



}