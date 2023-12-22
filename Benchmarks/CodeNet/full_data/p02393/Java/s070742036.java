import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
      Scanner S = new Scanner(System.in);
      int a = S.nextInt();
      int b = S.nextInt();
      int c = S.nextInt();
      if(a<b && b<c){
      System.out.printf("%d %d %d\n", a, b, c);
              }
      else if(a<b && c<b){
      System.out.printf("%d %d %d\n", a, c, b);
            }
       else if(b < a && a < c){
      System.out.printf("%d %d %d\n", b, a, c);
      }
       else if(b < c && c < a){
      System.out.printf("%d %d %d\n", b, c, a);
      }
       else if(c < a && a < b){
      System.out.printf("%d %d %d\n", c, a, b);
      }
      else{
      System.out.printf("%d %d %d\n", c, b, a);
 }
}
}
