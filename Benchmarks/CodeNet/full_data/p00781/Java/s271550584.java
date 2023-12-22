import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
    	new B().doIt();
    }
    class B{
    	String set[] = new String[5];
    	boolean slits[] = new boolean[10];
    	String map[][] = new String[2][10];
    	TreeSet<String> ts = new TreeSet<String>();
    	int result = 0;
    	void doIt(){
    		while(true){
    			String str = sc.nextLine();
    			if(str.equals("END"))break;
    			String slit[] = str.split(" ");
    			for(int i = 0;i < 10;i++){
    				map[0][i] = slit[i];
    				map[1][i] = new StringBuilder(slit[i]).reverse().toString();
//    				System.out.println(i+" "+map[0][i]+" "+map[1][i]);
    			}
    			dfs(0,"");
    			System.out.println(result/8);
    			ts.clear();
    			result = 0;
    		}
        }
    	void dfs(int deep,String str){
    		if(ts.add(str)){
    			if(deep < 5){
    				for(int i = 0;i < 10;i++){
    					if(slits[i])continue;
    					slits[i] = true;
    					set[deep] = map[0][i];
    					dfs(deep+1,str+map[0][i]);
    					set[deep] = map[1][i];
    					dfs(deep+1,str+map[1][i]);
    					slits[i] = false;
    				}
    			}else if(deep < 10){
    				for(int i = 0;i < 10;i++){
    					if(slits[i])continue;
    					slits[i] = true;
    					int num = deep % 5;
    					boolean ok = true;
    					for(int j = 0;j < 5;j++){
    						if(set[j].charAt(num) == map[0][i].charAt(j)){
    							ok = false;
    						}
    					}
    					if(ok){
							dfs(deep+1,str+map[0][i]);
						}
    					ok = true;
    					for(int j = 0;j < 5;j++){
    						if(set[j].charAt(num) == map[1][i].charAt(j)){
    							ok = false;
    						}
    					}
    					if(ok){
							slits[i] = true;
							dfs(deep+1,str+map[1][i]);
						}
    					slits[i] = false;
    				}
    			}else if(deep == 10){
    				result++;
//    				System.out.println(result);
    			}
    		}
//    		for(int i = 0;i < 5;i++){
//    			System.out.println(set[i]);
//    		}
//    		for(int i = 0;i < 10;i++){
//    			if(slits[i])System.out.print(i+" ");
//    		}
//    		System.out.println();
    	}
    }
}