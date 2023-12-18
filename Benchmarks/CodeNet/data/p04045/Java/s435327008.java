import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	int N = scanner.nextInt();
      	int K = scanner.nextInt();
      
   		//Listにうまく変換するため
      	Integer[] dislikeNumberInteger = new Integer[K];

      	for(int i = 0; i < K; i++) {
          	dislikeNumberInteger[i] = Integer.valueOf(scanner.nextInt());
        }

      	for(int i = 0; i < 4; i++) {
        	while(true) {
              	if(Arrays.asList(dislikeNumberInteger).contains(N / Math.pow(10, i) - (N / Math.pow(10, i + 1)) * 10) == false) {
                 	if(N < Math.pow(10, i + 1)) {
                    	System.out.println(N);
                      	return;
                    }
                  	break;
                }
              	N = N + (int) Math.pow(10, i);
            }
        }	
	}
}
 

 

