import java.util.*;
import java.util.stream.Collectors;
 
 
public class Main {
    public static void main(String[] args) {
    	
        Scanner scanner=new Scanner(System.in);
        
        int N = scanner.nextInt();

        int Number[] = new int[N];
        int pow[] = new int[20];
        
        for(int i=0;i <N;i++){
        	
        	Number[i] = scanner.nextInt();
        	
        }
        
        long ans = N;
        
        int memory=0;
        
        boolean flag;
        
        for(int i=0;i<N -1;i++){
        	
        	memory = Number[i];
        	flag=true;
        	
        	for(int k=0;k<20;k++){
        		pow[k] = memory%2;
        		memory/=2;
        	}
        	for(int j=i+1;j<N;j++){
        		memory = Number[j];
            	for(int k=0;k<20;k++){
            		if(memory%2==1)
            			if(pow[k]==1)
            				flag = false;
            			else
            				pow[k] = 1;
            		memory/=2;
            	}
            	if(!flag)
            		break;
            	
        		ans++;
        	}
        		
        }
        
        System.out.println(ans);
 
 
    }
 
}
