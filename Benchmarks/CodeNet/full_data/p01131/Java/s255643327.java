import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	new A().doIt();
    }
    class A{
    	char alf[][] = {{},
    			{'.',',','!','?',' '},
    			{'a','b','c'},
    			{'d','e','f'},
    			{'g','h','i'},
    			{'j','k','l'},
    			{'m','n','o'},
    			{'p','q','r','s'},
    			{'t','u','v'},
    			{'w','x','y','z'},
    			};
    	void doIt(){
    		int n = sc.nextInt();
//    		for(int i = 0;i < alf.length;i++){
//    			for(int j = 0;j < alf[i].length;j++){
//    				System.out.print(alf[i][j]+" ");
//    			}
//    			System.out.println();
//    		}
    		for(int i = 0;i < n;i++){
    			String str = sc.next();
    			char ctr[] = str.toCharArray();
    			StringBuilder sb = new StringBuilder();
    			int length = ctr.length;
    			int cnt[] = new int [10];
    			int pos = 0;
    			for(int j = 0;j < length;j++){
    				int num = Integer.parseInt(""+ctr[j]);
    				if(num == 0){
    					cnt[pos]--;
    					if(pos == 0 || cnt[pos] == -1);
    					else if(pos == 7 || pos == 9){
    						sb.append(alf[pos][(cnt[pos])%4]);
    					}else if(pos == 1){
    						sb.append(alf[pos][(cnt[pos])%5]);
    					}else{
    						sb.append(alf[pos][(cnt[pos])%3]);
    					}
    					cnt[pos] = 0;
    					pos = 0;
    				}else{
    					cnt[num]++;
    					pos = num;
    				}
    			}
    			System.out.println(sb);
    		}
    	}
    }
}