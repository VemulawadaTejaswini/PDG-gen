import java.util.*;
 public class Main {
	public static void main(String[] args){
      
      String S = "fight";
      int K = 2;

      if(S.length()  <= K){
         System.out.println(S);

      }else{
         System.out.println(S.substring(0,K) + "..." );
      }

   }
 }



