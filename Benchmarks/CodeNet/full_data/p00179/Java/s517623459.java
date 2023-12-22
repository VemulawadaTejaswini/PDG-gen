
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
    	int allnum = 100;
    	char all[][];
    	void dfs(int length,int num){
    		char c = all[num][0];
    		int cnt = 0;
    		for(int i = 0;i < length;i++){
    			if(c == all[num][i])cnt++;
//    			System.out.print(all[num][i]);
    		}
//    		System.out.println(" "+num);
    		if(cnt == length){
    			allnum = Math.min(allnum, num);
//    			System.out.println(num+" "+allnum);
    		}
    		for(int i = 0;i < length - 1;i++){
    			if(num < length){
    	    		for(int j = 0;j < length;j++){
    	    			all[num+1][j] = all[num][j];
    	    		}
    				if(all[num][i] != 'r' && all[num][i+1] != 'r' && all[num][i] != all[num][i+1]){
    					all[num+1][i] = 'r';all[num+1][i+1] = 'r';
    					dfs(length,num+1);
    				}else if(all[num][i] != 'b' && all[num][i+1] != 'b' && all[num][i] != all[num][i+1]){
    					all[num+1][i] = 'b';all[num+1][i+1] = 'b';
    					dfs(length,num+1);
    				}else if(all[num][i] != 'g' && all[num][i+1] != 'g' && all[num][i] != all[num][i+1]){
    					all[num+1][i] = 'g';all[num+1][i+1] = 'g';
    					dfs(length,num+1);
    				}
    			}
    		}
    	}
    	void doIt(){
    		while(true){
    			allnum = 100;
    			String str = sc.next();
    			if(str.equals("0"))break;
    			char ctr[] = str.toCharArray();
    			all = new char [ctr.length+1][ctr.length];
    			for(int i = 0;i < ctr.length;i++)all[0][i] = ctr[i];
    			dfs(ctr.length,0);
    			if(allnum != 100)System.out.println(allnum);
    			else System.out.println("NA");
    		}
    	}
    }
}