import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] in = new long [n];
        
        for(int i=1;i<=Math.sqrt(n)/6;i++){for(int j=1;j<=Math.sqrt(n)/6;j++){
          for(int k=1;k<=Math.sqrt(n)/6;k++){in[i*i+j*j+k*k+i*j+j*k+k*i-1]++;}                                                                                                                                                                                  
                                             }                                                                            
                                          }                         
         for(int i=0;i<n;i++){System.out.println(in[i]);}	
	}