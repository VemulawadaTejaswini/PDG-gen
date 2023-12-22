import java.util.Scanner;
   public class Main {
   public static void main(String[] args) {
     
        //sec--1 (definition)
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
         
        //sec--2 (branch)
          if(S == "SSS") {
            System.out.println(0);
          } else if (S == "SSR"){
            System.out.println(1);
          } else if (S == "SRR"){
            System.out.println(2);
          } else if (S == "RRR"){
            System.out.println(3);
          } else if (S == "RRS"){
            System.out.println(2);
          } else if (S == "RSS"){
            System.out.println(1);
          } else if (S == "RSR"){
            System.out.println(2);
          } else if (S == "SRS"){
            System.out.println(1);
          }
   }
}