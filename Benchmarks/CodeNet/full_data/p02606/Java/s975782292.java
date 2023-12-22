import java.util.Scanner;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      int L = in.nextInt();
      int R = in.nextInt();
      int d = in.nextInt();
      int r = R / d;
      int l = L /d ;
      if(r%d == 0){
      System.out.print(r-l+1);
      }
      else{
      System.out.print(r-l);
      }
      }
}