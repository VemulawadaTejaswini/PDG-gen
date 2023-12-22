import java.util.Scanner;
   public class Main {
   public static void main(String[] args) {
     
        //sec--1 (definition)
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int cnt = 0;
         
        //sec--2 (branch)
        for(int i=0; i<3; i++){
          S = S.substring(S.length() - i);
          if(S.equals("R")) {
            cnt++;
          } else if (S.equals("S")) {
            continue;
          }
        }
             System.out.println(cnt);
}
}