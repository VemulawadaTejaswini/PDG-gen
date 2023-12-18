import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        String T =sc.next();;
        char[] ct=T.toCharArray();
        long ans=0;
        boolean[] flg= new boolean[N];
        for(int i=0;i<N;i++)flg[i]=false;
        char pre=' ';
        boolean preflg;
        for(int i=0;i<N;i++) {
        	if(i<K) {
        		pre='k';
        		preflg=false;
        	} else {
        		pre = ct[i-K];
        		preflg=flg[i-K];
        	}
        	if(ct[i]==pre) {
        		if(preflg==false) {
        			flg[i]=true;        			
        		} else {
        			ans = ans + kekka(ct[i],R,S,P);
        		}
        	} else {
    			ans = ans + kekka(ct[i],R,S,P);
        	}
        }
        
        
        
        
        System.out.println(ans);
        		
    }
    
    public static int kekka(char a,int R, int S, int P) {
    	if(a=='r') {
    		return P;
    	} else if(a=='s') {
    		return R;
    	} else {
    		return S;
    	}
    }
}