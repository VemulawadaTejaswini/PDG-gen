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

      	int[] Narray = new int[3];
      	int devidedNumber = N;
      	for(int i = 3; i > -1; i--) {
        	int quotient = devidedNumber / (int) Math.pow(10, i);
          	Narray[3 - i] = quotient;
          	devidedNumber = devidedNumber % (int) Math.pow(10, i);
        }
      	
      	second:for(int i = 3; i > -1; i--) {
        	first:while(true) {
              	if(Arrays.asList(dislikeNumberInteger).contains(Narray[i])) {
                 	continue second; 	
                }
            	if(Arrays.asList(dislikeNumberInteger).contains(Narray[i]) && Narray[i] != 9) {
                	Narray[i] = Narray[i] + 1;
                  	continue first;
                } else if(Narray[i] == 9) {
                	Narray[i] = 0;
                  	Narray[i - 1] = Narray[i -1] + 1;
                  	continue first;
                }
            }
        }
      
      	String answer = Narray[0] + Narray[1] + Narray[2] + Narray[3];
          
       	System.out.println(answer);  	
	}
}
 

 

