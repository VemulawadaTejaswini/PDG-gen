import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    Team[] t;

    void run(){
	while(true){
	    n = sc.nextInt();
	    if(n==0) break;
	    t = new Team[n];
	    for(int i=0; i<n; i++)
		t[i] = new Team(sc.nextInt());

	    solve();
	}
    }

    void solve(){
	Arrays.sort(t, new Comparator<Team>(){
		public int compare(Team t1, Team t2){
		    int s1 = t1.getTime();
		    int s2 = t2.getTime();
		    return(s1-s2);
		}
	    }
	    );

	//show();

	System.out.println(t[0].getNum());
	System.out.println(t[1].getNum());
	System.out.println(t[n-2].getNum());
    }

    void show(){
	for(int i=0; i<n; i++)
	    System.out.println(t[i].getNum()+" "+t[i].getTime());
    }

    class Team{
	int num, time;
	Team(int n){
	    num = n;
	    int min = 0, sec = 0;
	    for(int i=0; i<4; i++){
		min += sc.nextInt();
		sec += sc.nextInt();
	    }
	    time = min*60 + sec;
	}
	int getTime(){ return time; }
	int getNum(){ return num; }
    }
}
	    
	