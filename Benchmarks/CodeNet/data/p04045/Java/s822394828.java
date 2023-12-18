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

      	for(int i = 0; i < 10; i++) {
        	while(true) {
              	//System.out.println(N / (int) Math.pow(10, i) - (N / (int) Math.pow(10, i + 1)) * 10);
              	if(Arrays.asList(dislikeNumberInteger).contains(N / (int) Math.pow(10, i) - (N / (int) Math.pow(10, i + 1)) * 10) == false) {
                 	if(N < (int) Math.pow(10, i + 1)) {
                      	if(Arrays.asList(dislikeNumberInteger).contains(0)) {
                        	for(int j = 1; j < 10; j++) {
                              	int newJ == j;
                            	if(Arrays.asList(dislikeNumberInteger).contains(newJ) = false) {
                                	for(int k = i; k < -1; k--) {
                                    	int newN = newN + j * (int) Math.pow(10, i);
                                    }
                                }
                            }
                        } 
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
 

 

