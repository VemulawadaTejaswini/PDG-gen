import java.util.*;

public class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();
	    int p = sc.nextInt();
	    if(n==0 && p==0) break;

	    int pp = p;
	    int[] have = new int[n];
	    int turn = 0;
	    int winner = 0;
	    while(true){
		if(pp==1 && have[turn]==p-1){
		    winner = turn;
		    break;
		}else if(pp>0){
		    pp--;
		    have[turn]++;
		    turn = (turn+1)%n;
		}else{
		    pp = have[turn];
		    have[turn] = 0;
		    turn = (turn+1)%n;
		}
	    }

	    System.out.println(winner);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}