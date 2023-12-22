import java.util.*;

class Main{

    int T,P,R;
    int[][] wrong;
    int[] penalty;
    int[] correct;
    int[] tID,pID,time;
    String[] message;
    void solve(){
	Scanner sc = new Scanner(System.in);
	while(true){
	    T = sc.nextInt();
	    P = sc.nextInt();
	    R = sc.nextInt();
	    tID = new int[R];
	    pID = new int[R];
	    time = new int[R];
	    message = new String[R];
	    if(T==0 && P==0 && R==0) break;
	    for(int i=0; i<R; i++){
		tID[i] = sc.nextInt();
		pID[i] = sc.nextInt();
		time[i] = sc.nextInt();
		message[i] = sc.next();
	    }
	    wrong = new int[T][P];
	    penalty = new int[T];
	    correct = new int[T];
	    for(int i=0; i<R; i++){
		if(message[i].equals("WRONG")){
		    wrong[tID[i]-1][pID[i]-1]++;
		}else{
		    correct[tID[i]-1]++;
		    penalty[tID[i]-1] += wrong[tID[i]-1][pID[i]-1] * 1200 + time[i];
		}
	    }

	    for(int i=0; i<T; i++){
		int max = -1;
		int maxIdx = 0;
		for(int j=0; j<T; j++){
		    if(correct[j]==-1) continue;
		    if(correct[j] == max && penalty[maxIdx]>penalty[j]){
			max = correct[j];
			maxIdx = j;
		    }
		    if(max<correct[j]){
			max = correct[j];
			maxIdx = j;
		    }
		}
		System.out.println((maxIdx+1)+" "+correct[maxIdx]+" "+penalty[maxIdx]);
		correct[maxIdx] = -1;
	    }
	}
    }
    public static void main(String[] args){
	new Main().solve();
    }
}