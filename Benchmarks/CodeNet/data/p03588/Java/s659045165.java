import java.util.*;
import java.util.stream.Stream;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
        int a[] = new int[N];
        int b[] = new int[N];
        int max = 0;
        int num = 0;
        int ans = 0;
        int count = 0;
        
        for(int i = 0; i<N; i++){
        	a[i] = sc.nextInt();
        }
        for(int i = 0; i<N; i++){
        	b[i] = sc.nextInt();
        }
        
        
        for(int i =0; i<N; i++){
        	if(max < a[i]){
        		max = a[i];
        		num = i;
        		break;
        	}
        }
        
        ans = (a[num-1] + b[num-1]);
        
        System.out.println(ans);
        	
        
        
        
      }
      
   }
