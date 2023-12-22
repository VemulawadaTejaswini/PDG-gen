import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
         
          Scanner sc = new Scanner(System.in);
         
          String s = sc.next(); 
          String t = sc.next();

         String T1 = t.substring(s.length() - 0); // ｔの末尾一文字だけを取り出せる


           if(t.equals(s+T1)) 
           {
             System.out.println("Yes");
           }
        else{
           System.out.println("No");
            }
         }
      }



