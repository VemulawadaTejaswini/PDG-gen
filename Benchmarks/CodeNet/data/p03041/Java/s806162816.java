import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int K = scan.nextInt();
      	int counter = 0;
      	for(int i = 1; i <= n; i++){
        	if(i > K - 1){
            	break;
            }
          	else{
              	int j = i;
            	while(j < K){
                	j = j * 2;
                    counter ++;
                }
            }
        }
      	double ans = (1/n) * (1/2)^counter;
      	System.out.print(ans);
    }
 
}