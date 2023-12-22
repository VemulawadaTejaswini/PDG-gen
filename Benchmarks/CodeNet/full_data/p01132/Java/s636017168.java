import java.util.*;

class Main{

    int need;
    int[] coin;
    int[] m = {10,50,100,500};
    void solve(){
	Scanner sc = new Scanner(System.in);
	boolean boo = false;
	while(true){
	    need = sc.nextInt();
	    if(need==0) break;
	    if(boo) System.out.println();
	    coin = new int[4];
	    int sum = 0;
	    for(int i=0; i<4; i++){
		coin[i] = sc.nextInt();
		sum += coin[i]*m[i];
	    }

	    int oturi = sum - need;
	    for(int i=3; i>=0; i--){
		while(oturi-m[i]>=0){
		    oturi -= m[i];
		    coin[i]--;
		}
	    }

	    for(int i=0; i<4; i++){
		if(coin[i]>0){
		    System.out.println(m[i]+" "+coin[i]);
		}
	    }
	    boo = true;
	}
    }
    public static void main(String[] args){
	new Main().solve();
    }
}