import java.util.*;

class Main{
    static int[][] field;
    static int w,h;
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	while(n!=0){

	    w = sc.nextInt();
	    h = sc.nextInt();

	    field = new int[h+1][w+1];
	    for(int i=0; i<n; i++){
		int x = sc.nextInt();
		int y = sc.nextInt();
		field[y][x] = 1;
	    }

	    int s = sc.nextInt();
	    int t = sc.nextInt();

	    int count = 0;
	    int max = 0;
	    for(int i=1; i<=h; i++){
		for(int j=1; j<=w; j++){
		    count = getCount(i,j,s,t);
		    //System.out.println("count"+count);
		    if(count>max)max = count;
		}
	    }	    
	    System.out.println(max);

	    n = sc.nextInt();
	}
    }

    public static int getCount(int x, int y, int s, int t){
	if(x+s>w+1 || y+t>h+1)return 0;
	int count = 0;
	for(int i=y; i<y+t; i++){
	    for(int j=x; j<x+s; j++){
		//System.out.println("x:"+j+" y:"+i);
		if(field[i][j]==1)count++;
	    }
	}
	return count;
    }
}