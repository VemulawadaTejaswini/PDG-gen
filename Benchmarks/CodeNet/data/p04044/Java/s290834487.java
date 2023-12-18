import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	int N = scanner.nextInt();
      	int L = scanner.nextInt();
      
      	String[] arrayOfWords = new String[N];

      	for(int i = 0; i < N; i++) {
          	arrayOfWords[i] = scanner.next();
        }
      
      	Arrays.sort(arrayOfWords);
         
      	for(int i = 0; i < N - 1; i++) {
        	String answer = answer + arrayOfWords[i];
        }
          
       	System.out.println(answer);  	
	}
}
 

 

