import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        
        int res;
        int count;
        for(int i=0; i<3; i++){
            if(S[i]=='R'){
                res++;
            }else{
                count = res;
                res = 0;
            }
        }
        
        System.out.println(Math.max(count,res));
                
            
        
        
        
        
        
        }
    }