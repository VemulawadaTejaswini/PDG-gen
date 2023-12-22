import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    void run(){
	while(sc.hasNext()){
	    int w = sc.nextInt();
	    int n = sc.nextInt();
	    int[][] lot = new int[n+1][w+1];
	    int i=1;
	    while(i<=n){
		String s = sc.next();
		int j=0;
		while(!s.substring(j, j+1).equals(",")) j++;
		int a = Integer.parseInt(s.substring(0, j));
		int b = Integer.parseInt(s.substring(j+1, s.length()));

		lot[i][a] = b;
		lot[i][b] = a;
		
		//System.out.println(i+" "+lot[i][a]+" "+lot[i][b]);
		i++;
	    }

	    i=1;
	    int[] ans = new int[w];
	    while(i<=w){
		ans[check(lot, i, n)-1] = i;
		i++;
	    }
	    for(i=0; i<w; i++)
		System.out.println(ans[i]);
	}
    }

    int check(int[][] lot, int i, int n){
	int k = 1;
	while(k<=n){
	    //System.out.println("*"+i+" "+lot[k][i]);
	    if(lot[k][i]!=0)
		i = lot[k][i];
	    k++;
	}
	//System.out.println();
	return i;
    }
}