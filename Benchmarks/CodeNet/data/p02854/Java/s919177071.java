import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
      	long bar[] = new long[n];
		long sum = 0;
      
      	for(int i=0;i<n;i++){
          bar[i] =sc.nextLong();
          sum = sum + bar[i];
        }
		double border = (double) sum/2;
      	long border_int=0;
      	long sum2=0;
      	
      	double sa_a=0;
      	double sa_b=0;
       	for(int i=0;i<n;i++){
          if(sum2>=border){
          	border_int = i;
	      	sa_a = (double)sum2-(double)border;
    	  	sa_b = (double)border - (double)sum2 + (double)bar[i-1];
            
            break;
          }else{
            sum2 = sum2 + bar[i];
          }
        }
      	
      	double min;
      	if(sa_a>sa_b){
        	min = sa_b;
        }else{
        	min = sa_a;
        }
      	    
        System.out.println((long)(min/0.5));
	}
}