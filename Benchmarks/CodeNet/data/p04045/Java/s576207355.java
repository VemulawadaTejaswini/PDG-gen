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
      
		int newN = 100000000;
      	for(int i = 0; i < 10; i++) {
        	while(true) {
              	//System.out.println(N / (int) Math.pow(10, i) - (N / (int) Math.pow(10, i + 1)) * 10);
              	if(Arrays.asList(dislikeNumberInteger).contains(N / (int) Math.pow(10, i) - (N / (int) Math.pow(10, i + 1)) * 10) == false) {
                 	if(N < (int) Math.pow(10, i + 1)) {
                      	if(Arrays.asList(dislikeNumberInteger).contains(0)) {
                        	for(int j = 1; j < 10; j++) {
                              	//System.out.println(Arrays.asList(dislikeNumberInteger).contains(j));
                            	if(Arrays.asList(dislikeNumberInteger).contains(j) == false) {
                                	//System.out.println("utasan");
                                  	//System.out.println(i);
                                  	for(int k = i; k < -1; k--) {
                                      	System.out.println("coming");
                                      	newN = 0;
                                    	newN = newN + j * (int) Math.pow(10, i);
                                    }
                                }
                            }
                        }
                      	System.out.println(N);
                      	System.out.println(newN);
                      	int answer = Math.min(N, newN);
                    	System.out.println(answer);
                      	return;
                    }
                  	break;
                }
              	N = N + (int) Math.pow(10, i);
            }
        }	
	}
}
 

 

