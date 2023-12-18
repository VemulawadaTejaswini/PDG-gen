import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String S = sc.nect();
   if(S.charAt(0)==S.charAt(1)){
     if(S.charAt(2)==S.charAt(3)){
     System.out.println("Yes");
     }
   }else if(S.charAt(0)==S.charAt(2)){
     if(S.charAt(2)==S.charAt(3)){
     System.out.println("Yes");
     }
   }else if(S.charAt(0)==S.charAt(2)){
     if(S.charAt(2)==S.charAt(3)){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
  }
 }
}