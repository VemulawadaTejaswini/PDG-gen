import java.util.Scanner;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int M = N / 1000;
       if (N%1000 == 0)
            System.out.println(0);
       else if (N > 1000)
            System.out.println(M * 1000-N);
       else 
         System.out.println(1000-N);
    }
}