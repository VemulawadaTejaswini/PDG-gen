import java.awt.geom.Point2D;
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1161().doIt();
    }
    class aoj1161{
    	int result = 0;
    	boolean alf[] = new boolean[128];
    	boolean number[] = new boolean[10];
    	int nn[] = new int[128];
    	ArrayList<Character> array = new ArrayList<Character>();
    	ArrayList<String> array2 = new ArrayList<String>();
    	void clear(){
    		result = 0;
    		for(int i = 0;i < 128;i++){
    			alf[i] = false;
    			nn[i] = 0;
    		}
    		for(int i = 0;i < 10;i++)number[i] = false;
    		array.clear();
    		array2.clear();
    	}
    	void dfs(int pos,int length){
    		if(pos < length){
    			for(int i = 0;i < 10;i++){
    				if(!number[i]){
    					number[i] = true;
    					nn[array.get(pos)] = i;
    					dfs(pos+1,length);
    					number[i] = false;
    				}
    			}
    		}else{
    		int sum = 0;
    			for(int i = 0;i < array2.size();i++){
    				String str = array2.get(i);
    				char ctr[] = str.toCharArray();
    				int num = 0;
    				for(int j = 0;j < str.length();j++){
    					if(j == 0 && nn[ctr[j]] == 0)break;
    					num = num * 10 + nn[ctr[j]];
    				}
    				if(i < array2.size() - 1){
    					sum = sum + num;
    				}else{
    					if(sum == num){
//    						for(int k = 0;k < array.size();k++){
//    							System.out.print(nn[array.get(k)]+" ");	
//    						}
//    						System.out.println(sum);
    						result++;
    					}
    				}
    			}
    		}
    	}
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			if(n == 0)break;
    			clear();
    			for(int j = 0;j < n;++j){
    				String str = sc.next();
        			array2.add(str);
        			char ctr[] = str.toCharArray();
    				for(int i = 0;i < str.length();++i){
    					if(!alf[ctr[i]]){
    						alf[ctr[i]] = true;
    						array.add(ctr[i]);
    					}
    				}
    			}
//    			for(int i = 0;i < array.size();++i){
//    				System.out.println(array.get(i));
//    			}
    			dfs(0,array.size());
    			System.out.println(result);
    		}
        }
     }
}