import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] S = new int[N];
    
    for (int i = 0; i < N; i++){
 		S[i] = sc.nextInt();     
    }
    String message = "APPROVED";
    for (int j = 0; j < N; j++){
    	if(S[j] %2 == 0){
  			if (S[j] %3 != 0 && S[j] %5 != 0){
             	message = "DENIED";  break;
            }
        }
     
    
    }
     System.out.println(message);
  }
}
