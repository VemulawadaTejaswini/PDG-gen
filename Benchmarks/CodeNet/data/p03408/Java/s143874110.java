import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            String[] red = new String[n];
            int[] count = new int[n];
            int counter = 0;
            
            for(int i=0; i<n; i++){
            	String s = sc.next();
            	int j = 0;
            	
            	if(s.equals(red[j])){
        			count[j]++;
        			
        		}else{
            	
            	while(j<counter && !s.equals(red[j])){
            		j++;
            		if(s.equals(red[j])){
            			count[j]++;
            		}
            	}
            	if(counter==j){
            		red[counter] = s;
            		count[counter] = 1;
            		counter++;
            	}
        		}
            }
            
            int m = Integer.parseInt(sc.next());
            
            for(int i=0; i<m; i++){
            	String s = sc.next();
            	int j = 0;
            	
            	if(s.equals(red[j])){
        			count[j]--;
        		}else{
            	
            	while(j<counter && !s.equals(red[j])){
            		j++;
            		if(s.equals(red[j])){
            			count[j]--;
            		}
            	}
        		}
            }
            
            int max = 0;
            for(int i=0; i<counter; i++){
            	if(count[i]>max){
            		max = count[i];
            	}
            }
            
            //出力
            System.out.println(max);
            sc.close();
        }
    }
	