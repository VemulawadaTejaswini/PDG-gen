
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
    	new aoj0179().doIt();
    }
    class aoj0179{
    	char[] map;
    	int num = 100;
    	char alf[] = {'r','b','g'};
    	void dfs(int cnt,int max){
    		if(cnt <= max+1){
//    			for(int i = 0;i < max+1;i++)System.out.print(map[i]);
//    			System.out.println(" "+cnt);
    			int c = 0;
    			for(int i = 0;i < max;i++){
    				if(map[i] == map[i+1])c++;
    			}
    			if(c == max)num = Math.min(num, cnt);
    			else if(cnt < num){
    				for(int i = 0;i < max;i++){
    					for(int j = 0;j < 3;j++){
    						for(int k = 0;k < 3;k++){
    							if(j == k)continue;
    							if(map[i] == alf[j] && map[i+1] == alf[k]){
    								map[i] = alf[3-(j+k)];map[i+1] = alf[3-(j+k)];
    								dfs(cnt+1,max);
    								map[i] = alf[j];map[i+1] = alf[k];
    							}
    						}
    					}
    				}
    			}
    		}
    	}
    	void doIt(){
    		while(true){
    			num = 100;
    			String str = sc.next();	
    			if(str.equals("0"))break;
    			char ctr[] = str.toCharArray();
    			map = new char [str.length()];
    			for(int i = 0;i < str.length();i++)map[i] = ctr[i];
    			dfs(0,str.length()-1);
    			if(num == 100)System.out.println(num);
    			else System.out.println("NA");
    		}
    	}
    }
}