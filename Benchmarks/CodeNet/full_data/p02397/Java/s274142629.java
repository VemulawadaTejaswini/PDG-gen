import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
   Scanner S = new Scanner(System.in);

      while(true){

      int a = S.nextInt();
      int b = S.nextInt();

      if(a < b){
      System.out.printf("%d %d",a, b);
              }
      else {
      System.out.printf("%d %d",b, a);
           }

      }
 }
}

