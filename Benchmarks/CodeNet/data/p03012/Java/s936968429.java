import java.io.*; 
import java.util.Scanner;
import java.lang.Math;

public class Main {
  
	public static void main(String[] args){
      	Scanner in = new Scanner(System.in);
		int N = in.nextInt();
      	int[] weigths = new int[N];
      
      	for(int i=0;i<N;i++){
        	weigths[i]= in.nextInt();
        }
        
      	if(N>1) System.out.println(balance(weigths, N));
      	else System.out.println(weigths[0]);
	}
  	
    public static int balance(int[] weigths, int n){
      	int S1 = weigths[0];
      	int S2 = weigths[weigths.length-1];
      	int indexL = 1;
      	int indexR = weigths.length-2;
      	int counter = n-2;
      	while(counter>0){
        	if(S1<=S2){
              S1+=weigths[indexL];
              indexL++;
              counter--;
            }else{
              S2+=weigths[indexR];
              indexR--;
              counter--;
            }
        }
      	int ret = S1-S2;
      	return Math.abs(ret);
    }
}
