import java.util.*;

class Main{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      int[] Luca = new int[87];
      int   N    = scan.nextInt();
      Luca[0] = 2;
      Luca[1] = 1;
      for(int i = 2; i < N + 1; i++){
          Luca[i] = Luca[i - 1] + Luca[i - 2];
          }
      System.out.println(Luca[N]);
   }
}
