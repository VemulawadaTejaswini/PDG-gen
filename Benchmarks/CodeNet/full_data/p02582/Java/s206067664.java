import java.util.Scanner;
   public class Main {
   public static void main(String[] args) {
     
        //sec--1 (definition)
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
         
        //sec--2 (branch)
          if(S.equals("SSS")) {
            count = 0;
          } else if (S.equals("SSR")) {
            count = 1;
          } else if (S.equals("SRR")) {
            count = 2;
          } else if (S.equals("RRR")) {
            count = 3;
          } else if (S.equals("RRS")) {
            count = 2;
          } else if (S.equals("RSS")) {
            count = 1;
          } else if (S.equals("RSR")) {
            count = 2;
          } else if (S.equals("SRS")) {
            count = 1;
          }
     System.out.println(count);
     sc.close();
   }
}
