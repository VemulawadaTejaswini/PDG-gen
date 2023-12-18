import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		
		int[] ax = new int[a];
		int[] by = new int[b];
		
		int amin = 100000;
		int bmin = 100000;
		
        for(int i=0; i<a; i++){
        	ax[i] = sc.nextInt();
        	if(ax[i] < amin){
        	    amin = ax[i];
        	}
        }
      	
      	for(int i=0; i<b; i++){
      	    by[i] = sc.nextInt();
      	    if(by[i] < bmin){
        	    bmin = by[i];
        	}
      	}
      	
      	int ans = amin + bmin;
      	
      	for(int i=0; i<m; i++){
      	    int mx = sc.nextInt();
      	    int my = sc.nextInt();
      	    int mc = sc.nextInt();
      	    
      	    int mans = ax[mx-1] + by[my-1] - mc;
      	    if(mans<ans){
      	        ans = mans;
      	    }
      	}
      	
      	System.out.println(ans);
    }
}