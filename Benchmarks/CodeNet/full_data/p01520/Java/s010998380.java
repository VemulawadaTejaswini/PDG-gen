import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, t, e;
    int[] clock;
    boolean solved;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    t = sc.nextInt();
	    e = sc.nextInt();
	    clock = new int[n+1];
	    for(int i=1; i<clock.length; i++)
		clock[i] = sc.nextInt();
	    solved = false;
	    solve();
	}
    }

    void solve(){
	int time;
	for(int i=1; i<clock.length; i++){
	    time = clock[i];
	    while(time < t-e) time += clock[i];
	    if((t-e)<=time && time<=(t+e)){
		System.out.println(i);
		solved = true;
		break;
	    }
	}
	if(!solved) System.out.println("-1");
    }
}
		
	    