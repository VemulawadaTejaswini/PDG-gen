import java.util.Scanner;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int M = N / 1000;
       if (N%1000 == 0)
            System.out.println(0);
       else 
          
            System.out.println(N - M * 1000);
    }
}