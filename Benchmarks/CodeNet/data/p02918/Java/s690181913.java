import java.util.*;
 
public class Main {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		String s = stdIn.next();
		char c[] = s.toCharArray();
		
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < n - 1; i++){
		    int count = 0;
		    for(int j = i + 1; j < n - 1; j++){
		        if(c[i] == c[j]){
		            count++;
		        }
		        
		    }
		    if(max < count){
		        max = count;
		        index = i;
		    }
		    count = 0;
		    
		    if(n - 1 < max){
		        break;
		    }
		}
		
		for(int i = 0; i < k; i++){
		    
		}
		
		//System.out.println(sum);
		
	}
}