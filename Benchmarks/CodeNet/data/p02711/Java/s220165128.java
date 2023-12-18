import java.util.Random;
public class Main { //クラス名はMain
    public static void main(String[] args) {
      Random rand = new Random();
      int N = rand.nextInt(900) + 100;
      int hundreds = N / 100;
      int tens = (N / 10) % 10; // (n % 100) / 10
      int ones = N % 10;
       if ((hundreds == 7) || (tens == 7) || (ones == 7))
            System.out.println("Yes");
       else
            System.out.println("No");
        
  
    }
}