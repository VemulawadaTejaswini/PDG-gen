import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int[] A = new int[5];
      	int[] B = new int[5];
      	for(int i = 0; i < 5; i++){
        	A[i] = scan.nextInt();
          	B[i] = tenth(A[i]);
        }
      	int min = 9;
      	int pointer = 0;
      	int all = 0;
      	int k = 0;
      	for(int i = 0; i < 5; i++){
        	if(ichi(A[i]) < min && ichi(A[i]) != 0){
            	min = A[i];
              	k = B[i];
              	pointer = i;
            }
        }
      	all = B[0] + B[1] + B[2] + B[3] + B[4] - k;
      	all = all + min;
      	System.out.print(all);
    }
  	public static int tenth(int a){
    	while(a % 10 != 0){
        	a++;
        }
      	return a;
    }
  	public static int ichi(int b){
    	while(b >= 10){
        	b = b - 10;
        }
      	return b;
    }
 
}