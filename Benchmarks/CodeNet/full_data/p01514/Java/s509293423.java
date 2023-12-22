import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    int T; int P; int R;
    int t; int p; int ti; String m;
    int[] rank;

    void run(){
	while(sc.hasNext()){
	    T = sc.nextInt();
	    P = sc.nextInt();
	    R = sc.nextInt();
	    if(T!=0) solve();
	}
    }

    void solve(){
	Team[] team = new Team[T];
	rank = new int[T];
	for(int i=0; i<T; i++){
	    team[i] = new Team(i+1, P);
	    rank[i] = i;
	}

	while(R>0){
	    R--;
	    t = sc.nextInt();
	    p = sc.nextInt();
	    ti = sc.nextInt();
	    m = sc.next();
	    team[t-1].doLog(p, ti, m);
	}

	sort(team);

	for(int i=0; i<team.length; i++){
	    System.out.println(team[rank[i]].getID()+" "+team[rank[i]].getCorrect()
			       +" "+team[rank[i]].getTime());
	}
    }

    void sort(Team[] team){
	for(int i=0; i<rank.length-1; i++){
	    for(int j=i+1; j<rank.length; j++){
		int a = team[ rank[i] ].getCorrect();
		int b = team[ rank[j] ].getCorrect();
		if(a < b){
		    int temp = rank[i];
		    rank[i] = rank[j];
		    rank[j] = temp;
		}
		else if(a == b){
		    int t1 = team[rank[i]].getTime();
		    int t2 = team[rank[j]].getTime();
		    if(t1 > t2){
			int temp = rank[i];
			rank[i] = rank[j];
			rank[j] = temp;
		    }
		    else if(t1 == t2){
			int i1 = team[rank[i]].getID();
			int i2 = team[rank[j]].getID();
			if(i1 > i2){
			    int temp = rank[i];
			    rank[i] = rank[j];
			    rank[j] = temp;
			}
		    }
		}
	    }
	}
    }

    class Team{
	int id;
	int correct;
	int time;
	int[] pena;
	boolean[] pro;

	Team(int i, int p){
	    id = i;
	    correct = 0;
	    time = 0;
	    pena = new int[p+1];
	    pro = new boolean[p+1];
	}

	void doLog(int p, int t, String m){
	    if(m.equals("WRONG")){
		pena[p]++;
	    }
	    else {
		pro[p] = true;
		correct++;
		time += t+(pena[p]*1200);
	    }
	}
	int getID(){ return id; }
	int getCorrect(){ return correct; }
	int getTime(){ return time; }
    }
}