import java.util.Scanner;
  public class Main {
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
         int a = Integer.parseInt(sc.nextLine());
        String s = sc.next();

        String ans = "Yes";
        if (s.length() % 2==1) {ans="No"; }
         else{
          for (int i = 0; i < a/2; i++) {
             if (s.charAt(i)!=s.charAt(i+a/2)) {ans="No";} 
         } 
         }

         
         System.out.println(ans);
     }
 }