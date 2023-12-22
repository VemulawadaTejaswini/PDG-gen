import java.util.*;

class Main{

    int N,A,B,C;
    int[] Y;

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){  
	    N = sc.nextInt();
	    A = sc.nextInt();
	    B = sc.nextInt();
	    C = sc.nextInt();
	    int X = sc.nextInt();
	    if(N==0 && A==0 && B==0 && C==0 && X==0) break;

	    Y = new int[N];
	    for(int i=0; i<N; i++) Y[i] = sc.nextInt();

	    int cnt = 0;
	    boolean notFound = false;
	    for(int i=0; i<N; i++){
		while(true){
		    cnt++;
		    if(X==Y[i]){
			X = (A*X+B)%C;
			break;
		    }
		    X = (A*X+B)%C;

		    if(cnt>10000){
			notFound = true;
			break;
		    }
		}
	    }

	    if(notFound) System.out.println(-1);
	    else System.out.println(cnt-1);
	}
    }

    public static void main(String[] args){
	new A2009().solve();
    }
}