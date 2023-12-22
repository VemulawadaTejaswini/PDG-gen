
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	while(sc.hasNext()){
    		new aoj0076().doIt();
    	}
    }
    class aoj0076{
    	boolean result = false;
    	void dfs(int cnt,int num[]){
//    		System.out.print(cnt+" ");
//    		for(int i = 1;i <= 9;i++)System.out.print(num[i]);
//    		System.out.println();
    		if(cnt == 4){
    			for(int i = 1;i <= 9;i++)if(num[i] == 2)result = true;
    		}else{
    			for(int i = 1;i <= 7;i++){
    				if(num[i] > 0 && num[i+1] > 0 && num[i+2] > 0){
    					num[i]--;num[i+1]--;num[i+2]--;
    					dfs(cnt+1,num);
    					num[i]++;num[i+1]++;num[i+2]++;
    				}
    			}
    			for(int i = 1;i <= 9;i++){
    				if(num[i] > 2){
    					num[i] -= 3;
    					dfs(cnt+1,num);
    					num[i] += 3;
    				}
    			}
    		}
    	}
    	void doIt(){
    		String str = sc.next();
    		char ctr[] = str.toCharArray();
    		int num[] = new int [10];
    		boolean nump[] = new boolean[10];
    		for(int i = 0;i < 13;i++)num[Integer.parseInt(""+ctr[i])]++;
    		for(int i = 1;i <= 9;i++){
    			if(num[i] == 4)continue;
    			num[i]++;
    			result = false;
    			dfs(0,num);
    			if(result)nump[i] = true;
    			num[i]--;
    		}
    		int c = 0;
    		for(int i = 1;i < 10;i++){
    			if(nump[i])c++;
    		}
    		if(c == 0)System.out.println(0);
    		else{
    			int c2 = 0;
    			for(int i = 1;i <= 9;i++){
    				if(c2 == 0){
    					if(nump[i]){
    						System.out.print(i);
    						c2++;
    					}
    				}else{
    					if(nump[i]){
    						System.out.print(" "+i);
    						c2++;
    					}
    				}
    				if(c == c2){
    					System.out.println();
    					break;
    				}
    			}
    		}
    	}
    }
}