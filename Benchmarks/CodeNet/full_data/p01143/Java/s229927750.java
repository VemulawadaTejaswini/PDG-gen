import java.util.*;
 
public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main();
    }
 
    public Main(){
    	new AOJ2018().doIt();
    }
    
    
    class AOJ2018{
    	
    	int solve(int n,int m,int p){
    		int result = 0;
    		int cnt = 0;
    		int[] hose = new int[n];
    		for(int i=0;i<n;i++)hose[i] = in.nextInt();
    		for(int i=0;i<n;i++)cnt+=hose[i];
    		cnt=cnt*100;
//    		System.out.println(cnt);
    		if(hose[m-1]==0)result = 0;
    		else result = cnt*(100-p)/100/hose[m-1];
    		return result;
    	}
    	
    	void doIt(){
    		while(in.hasNext()){
    			int n = in.nextInt();
    			int m = in.nextInt();
    			int p = in.nextInt();
    			if(n+m+p==0)return;
    			System.out.println(solve(n,m,p));
    		}
    	}
    }
    
}