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
	/*
	for(int i=0;i<nS;i++){
	    if(binary(0,nS,T[i])){
		cnt++;
	    }
	}
	*/
	
	int cnt = 0;
	for(int i=0;i<nT;i++){
	    int right=S.length-1;
	    int left = 0;
	    int center = (right+left)/2;
	    while(left<=right){
		if(S[center]==T[i]){
		    cnt++;
		    break;
		}
		if(S[center]>T[i]){
		    right=center-1;
		}else{
		    left=center+1;
		}
		center = (right+left)/2;
	    }
	}
	System.out.println(cnt);
  
    }

    public static boolean binary(int s,int t, int x){
	if(s==t){
	    if(x==S[s]){
		return true;
	    }else{
		return false;
	    }
	}else{
	    if(x>=S[(s+t)/2]){
		return binary((s+t)/2,t,x);
	    }else{
		return binary(s,(s+t)/2,x);
	    }
	}
    }
}

