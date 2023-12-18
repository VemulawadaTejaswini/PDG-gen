import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
      	long as[] = new long[n+1];
      	long lstack;
      	int count;
      	int num = 0;
      
      	for(int i = 0;i < n;i++) as[i] = sc.nextLong();
      	as[n] = 0;
      	Arrays.sort(as);
	     
  		lstack = as[n];
      	count = 1;
      
      	for(int i = n-1;i > -1;i--) {
        	if(lstack == as[i]) count++;
          	else {
              if(count % 2 == 1) num++;
              lstack = as[i];
              count=1;            
            }
        }
        System.out.println(num);
      
	}
}