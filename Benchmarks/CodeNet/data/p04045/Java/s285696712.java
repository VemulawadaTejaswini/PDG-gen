import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	int N = scanner.nextInt();
      	int K = scanner.nextInt();
      
      	int[] dislikeNumber = new int[K];

      	for(int i = 0; i < K; i++) {
          	dislikeNumber[i] = scanner.nextInt();
        }
      
      	int devidedNumber = N;
      	int answer = N;
      	for(int i = 3; i > -1; i--) {
          	int quotient = devidedNumber / Math.pow(10, i);
          	if(Arrays.asList(dislikeNumber).contains(quotient)) {
            	devidedNumber = devidedNumber + 1;
              	answer = answer + 1;
             	return;
            }
          	devidedNumber = devidedNumber % Math.pow(10, i);
        }
          
       	System.out.println(answer);  	
	}
}
 

 

