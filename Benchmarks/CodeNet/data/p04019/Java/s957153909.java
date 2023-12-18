import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    String s = sc.next();

	    int N = 0;
	    int S = 0;
	    int W = 0;
	    int E = 0;
	    int n = s.length();
	    for(int i = 0; i<n ;i++){
	    	if(s.charAt(i) == N ){
	    		N++;
	    	}
	    	if(s.charAt(i) == S ){
	    		S++;
	    	}
	    	if(s.charAt(i) == W ){
	    		W++;
	    	}
	    	if(s.charAt(i) == E ){
	    		E++;
	    	}

	    }
	    if((N*S == 0 && (N!=0||S!=0)) ||( W*E==0&&(W!=0||E!=0))){
	    	System.out.println("No");
	    }else{
	    	System.out.println("Yes");
	    }

	}
}