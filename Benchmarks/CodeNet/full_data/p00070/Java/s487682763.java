import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	while(sc.hasNext()){
    		new aoj0090().doIt();
    	}
    }
    class aoj0090{
    	int cnt = 0;
    	boolean num[] = new boolean [10];
    	void dfs(int n,int s,int c){
//    		System.out.println(s+" "+c+" "+cnt);
    		if(c == n && s == 0)cnt++;
    		if(c < n && s >= 0){
    			for(int i = 0;i <= 9;i++){
    				if(!num[i]){
    					if(s - (i*c) < 0)break;
    					num[i] = true;
    					dfs(n,s-(i*c),c+1);
    					num[i] = false;
    				}
    			}
    		}
    	}
    	void doIt(){
    		int n = sc.nextInt();
    		int s = sc.nextInt();
    		int max = 0;
    		for(int i = 0;i < 10;i++)max += i*(i+1);
    		cnt = 0;
    		if(n > 10 || s > max)System.out.println(0);
    		else{
    			if(s <= max){
    				dfs(n+1,s,1);
    				System.out.println(cnt);
    			}
    		}
    	}
    }
}