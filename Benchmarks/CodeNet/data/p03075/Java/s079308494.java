import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
      	int[] numlist  = new int[5];
      	int k;
      
      	for(int i=0;i<5;i++){
        	numlist[i] = sc.nextInt(); 
        }
      	k = sc.nextInt();
      	
      	if((numlist[0] - numlist[4])>k){
        	System.out.println("Yay!"); 
        }else{
         	System.out.println(":(") ;
        }
      	
    }
}