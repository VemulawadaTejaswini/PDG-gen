import java.util.*;

class Main{

    String[] shape = {"Rock", "Fire", "Scissors", "Snake", "Human", "Tree", "Wolf", "Sponge", "Paper", "Air", "Water", "Dragon", "Devil", "Lightning", "Gun"};

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();
	    if(n==0) break;

	    String[] hands = new String[n];
	    for(int i=0; i<n; i++){
		hands[i] = sc.next();
	    }

	    boolean[] win = new boolean[n];
	    boolean[] lose = new boolean [n];
	    for(int i=0; i<n; i++){
		int index = 0;
		for(int j=0; j<shape.length; j++){
		    if(hands[i].equals(shape[j])){
			index = j;
			break;
		    }
		}
		for(int j=1; j<=7; j++){
		    String losehand = shape[(index+j)%shape.length];
		    for(int k=0; k<hands.length; k++){
			if(hands[k].equals(losehand)){
			    win[i] = true;
			    lose[k] = true;
			}
		    }
		}
	    }

	    ArrayList<String> winner = new ArrayList<String>();
	    for(int i=0; i<n; i++){
		if(win[i] && !lose[i]){
		    if(!winner.contains(hands[i]))winner.add(hands[i]);
		    if(winner.size()>=2) break;
		}
	    }

	    if(winner.size()==1){
		System.out.println(winner.get(0));
	    }else{
		System.out.println("Draw");
	    }
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}