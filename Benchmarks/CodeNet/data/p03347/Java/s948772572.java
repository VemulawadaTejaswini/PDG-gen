
import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next()), ret = 0, temp = 0;
            int[] num = new int[n];
            
            for(int i=0; i<n; i++){
            	num[i] = Integer.parseInt(sc.next());
            }
            
            for(int i=n-1; i>=0; i--){
            	if(num[i] > i){
            		ret = -1;
            		break;
            	}
            	
            	if(num[i] != temp){
            		if(num[i] < temp){
            			ret = -1;
            			break;
            		}else{
            			temp = num[i];
            			ret += num[i];
            		}
            	}
            	
            	temp--;
            }
            
            System.out.println(ret);
            sc.close();
        }
    }
	