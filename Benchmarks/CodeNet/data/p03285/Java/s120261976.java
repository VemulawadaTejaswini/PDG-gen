import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String judge = "No";
      
      for(int i=0; i<26; i++){
	    for(int j=0; j<15; j++){
          if(i*4 + j*7 == N){
            judge = "Yes";
          } else if(i*4 + j*7 > N){
            break;
          }
        }
      }  
      
      System.out.println(judge);
    }  
}  