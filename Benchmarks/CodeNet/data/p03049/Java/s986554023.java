import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	String[] arr = new String[n];
      	for (int i= 0; i < n; i ++){
        	arr[i] = scan.next();
        }
      	int countB = 0;
      	int countA = 0;
      	int countAB = 0;
      	for(int j = 0; j < n; j++){
         	if(arr[j].substring(arr[j].length()-1).contains("A")){
            	countA ++;
            }
			if(arr[j].substring(0,1).contains("B")){
            	countB ++;
            }
          	for(int k = 0;k < arr[j].length() -1; k ++){
            	if(arr[j].substring(k,k + 1).contains("A") && arr[j].substring(k + 1,k + 2).contains("B")){
                	countAB ++;
                }
            }	
        }
      	int min = Math.min(countA, countB);
      	System.out.print(min + countAB);
      	
    }

}