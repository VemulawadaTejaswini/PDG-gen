import java.util.Scanner;

class Main{
    private static int nS;
    private static int nT;
    private static int[] S;
    private static int[] T;
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	nS = sc.nextInt();	
	S = new int[nS];
	for(int i=0;i<nS;i++){
	    S[i] = sc.nextInt();
	}
	nT = sc.nextInt();
	T = new int[nT];
	for(int i=0;i<nT;i++){
	    T[i] = sc.nextInt();
	}
	
	int cnt = 0;
	for(int i=0;i<nT;i++){
	    for(int j=0;j<nS;j++){
		if(T[i] == S[j]){
		    cnt++;
		    break;
		}
	    }
	}
	System.out.println(cnt);
	
    }

    
}

