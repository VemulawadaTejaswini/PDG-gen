import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, m;
    int[][] set;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    m = sc.nextInt();
	    if(n==0 && m==0) break;
	    set = new int[m][2];

	    for(int i=0; i<m; i++)
		set[i][0] = i+1;
	    for(int i=0; i<n; i++)
		for(int k=0; k<m; k++)
		    if(sc.nextInt()==1) set[k][1]++;

	    Arrays.sort(set, new Comparator<int[]>(){
		public int compare(int[]a, int[]b){
		    int x1 = a[1];
		    int x2 = b[1];
		    if(x1 != x2) return x2-x1;
		    else return a[0]-b[0];
		}
	    }
	    );

	    show();
	}
    }

    void show(){
	System.out.print(set[0][0]);
	for(int i=1; i<m; i++)
	    System.out.print(" "+set[i][0]);
	System.out.println();
    }
}