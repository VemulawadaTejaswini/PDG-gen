import java.util.*;

class Main{
    int T;
    int[] number;
    int[] R,G,B;

    void solve(){
	Scanner sc = new Scanner(System.in);
	T = sc.nextInt();
	while(T-->0){
	    number = new int[9];
	    for(int i=0; i<9; i++)number[i] = sc.nextInt();
	    R = new int[10];
	    G = new int[10];
	    B = new int[10];
	    for(int i=0; i<9; i++){
		char c = sc.next().charAt(0);
		if(c=='R')R[number[i]]++;
		if(c=='G')G[number[i]]++;
		if(c=='B')B[number[i]]++;
	    }

	    for(int i=0; i<=9; i++){
		if(R[i]>0){
		    if(R[i]==4 || R[i]==3) R[i]-=3;
		    if(R[i]<=2 && i+2<=9){R[i+1]-=R[i]; R[i+2]-=R[i]; R[i] = 0;}
		}
		if(G[i]>0){
		    if(G[i]==4 || G[i]==3) G[i]-=3;
		    if(G[i]<=2 && i+2<=9){G[i+1]-=G[i]; G[i+2]-=G[i]; G[i] = 0;}
		}
		if(B[i]>0){
		    if(B[i]==4 || B[i]==3) B[i]-=3;
		    if(B[i]<=2 && i+2<=9){B[i+1]-=B[i]; B[i+2]-=B[i]; B[i] = 0;}
		}
	    }

	    int ans = 1;
	    for(int i=0; i<=9; i++){
		if(R[i]!=0 || G[i]!=0 || B[i]!=0){ans = 0; break;}
	    }
	    System.out.println(ans);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}