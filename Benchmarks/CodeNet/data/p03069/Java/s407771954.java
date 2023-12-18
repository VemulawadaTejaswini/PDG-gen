import java.util.*;
public class Main {
 
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int N;
	    String S;
	    
	    N=sc.nextInt();
	    S=sc.next();
	    
	    int white[]=new int[N+1];
	    int black[]=new int[N+1];
	    
	    white[0]=0;
	    black[0]=0;
	    
	    for(int i=1;i<N+1;i++){
	    	if(S.charAt(i-1)=='.') {
	    		white[i]=white[i-1]+1;
	    		black[i]=black[i-1];
	    	}else if(S.charAt(i-1)=='#') {
	    		white[i]=white[i-1];
	    		black[i]=black[i-1]+1;
	    	}
	    }
	    
	    int ans=1000000000;
	    for(int k=0;k<N+2;k++) {
	    	if(k!=N+1) {
	    	ans=ans<black[k]+(white[N]-white[k])?ans:black[k]+(white[N]-white[k]);
	    	}else {
	    	ans=ans<black[N]?ans:black[N];
	    	}
	    }
	    
	    System.out.println(ans);
	    
	}
 
}