import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int K = sc.nextInt();
      	int S = sc.nextInt();
      	int count = 0;
      	for(int i = 0; i <= K; i++){
        	for(int j = 0; j <= K; j++){
            	for(int k = 0; k <= K; k++){
                	if(i+j+k == S) count++;
                }
            }
        }
      	System.out.println(count);
    }
}