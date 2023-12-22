import java.util.Scanner;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      int K = in.nextInt();
      int A = in.nextInt();
      int B = in.nextInt();
     
       if ((B/K - A/K >=1)||(B%K==0)||(A%K==0))
            System.out.println("OK");
       else
            System.out.println("NG");
    }
}