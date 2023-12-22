import java.util.*;
 
public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main();
    }
 
    public Main(){
    	new AOJ2149().doIt();
    }
    
    
    class AOJ2149{
    	int n,a,b,c,x;
    	int[] frame;
    	
    	void solve(){
    		int result = -1;
    		int cnt = 0;
    		int nx = x;
    		for(int s=0;s<=10000;s++){
    			if(frame[cnt]==nx){
    				cnt++;
    			}
    			nx = (a*nx+b)%c; 
//    			System.out.println(s+" "+nx);
    			if(cnt==n){
    				result = s;break;
    			}
    		}
    		System.out.println(result);
    	}
    	
    	void doIt(){
    		while(in.hasNext()){
    			n = in.nextInt();
    			a = in.nextInt();
    			b = in.nextInt();
    			c = in.nextInt();
    			x = in.nextInt();
    			if(n+a+b+c+x==0)break;
    			frame = new int[n];
    			for(int i=0;i<n;i++)frame[i] = in.nextInt();
    			solve();
    		}
    	}
    }
    
}