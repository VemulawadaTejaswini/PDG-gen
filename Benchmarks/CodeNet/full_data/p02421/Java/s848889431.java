// ITP1_9_C Card Game
import java.io.*;

class Main {

   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int taro = 0;
      int hanako = 0;
      try {
         int n = Integer.parseInt(br.readLine());
         for (int i = 0; i < n; i++) {

            String[] cards = br.readLine().split(" ");
            if (cards[0].compareTo(cards[1]) > 0) {
               taro += 3;
            } else if (cards[0].compareTo(cards[1]) == 0) {
               taro++;
               hanako++;
            } else if (cards[0].compareTo(cards[1]) < 0) {
               hanako += 3;
            }
         }
         System.out.println(taro + " " + hanako);
      }
      catch (Exception e) {
         System.err.println(e);
      }
   }
}