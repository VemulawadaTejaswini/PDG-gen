
import java.util.*;
	public class Main2{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            long[] sum = new long[n+1];
            long temp = 0;
            long count = 0;
            
            sum[0] = 0;
            
            for(int i=0; i<n; i++){
            	temp += Integer.parseInt(sc.next());
            	sum[i+1] = temp;
            }
            
            for(int i=0; i<n+1; i++){
            	for(int j=0; j<i; j++){
            		if(sum[j] - sum[i] == 0){
            			count++;
            		}
            	}
            }
            
            //出力
            System.out.println(count);
            sc.close();
        }
    }
	