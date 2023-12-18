import java.util.*;
 
public class Main {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int p[] = new int[n];
		int sum = 0;
		int first = 0;
		int second = 1;
		
		for(int i = 0; i < n; i++){
		    p[i] = stdIn.nextInt();
		}

		
		for(int i = 0; i < n - 1; i++){
		    int f = p[i];
        	int firstindex = i;
        	int s = p[i + 1];
        	int secondindex = i + 1;
		
		    for(int j = i + 1; j < n; j++){
		        if(p[j] >= f){
		            s = f;
		            secondindex = firstindex;
		            f = p[j];
		            firstindex = j;
		        }else if(p[j] >= s){
		            s = p[j];
		            secondindex = j;
		        }
		        
		        //System.out.println(f + " " + s);
		        
		        sum += s;
		    }
		    
		    
		}
		
		
		System.out.println(sum);
		
	}
}