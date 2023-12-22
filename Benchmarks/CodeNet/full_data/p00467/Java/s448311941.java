import java.util.Scanner;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt(), m = sc.nextInt(), p = 1, tn;
	    if(n+m == 0) break;
	    int[] map = new int[n+1];
	    int[] dice = new int[m];

	    for(int i = 1; i <= n; i++) map[i] = sc.nextInt();
	    for(int i = 0; i < m; i++) dice[i] = sc.nextInt();

	    for(tn = 0; tn < m && p < n; tn++){
		p += dice[tn];
		if(p <= n){
		    p += map[p];
		    if(p < 1) p = 1;
		}
	    }

	    System.out.println(Integer.toString(tn));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}