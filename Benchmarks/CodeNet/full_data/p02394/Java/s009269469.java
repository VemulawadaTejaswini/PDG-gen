import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String An = sc.nextLine();
      String[] max = An.split(" ");
      

      int W = Integer.parseInt(max[0]);
      int H = Integer.parseInt(max[1]);
      int x = Integer.parseInt(max[2]);
      int y = Integer.parseInt(max[3]);
      int r = Integer.parseInt(max[4]);
      
      int A = W - x;
      int B = H - y;
      if (x >= r && y >= r && A >= r && B >= r){
        System.out.println("Yes");
      }else
      System.out.println("No");
  }
}