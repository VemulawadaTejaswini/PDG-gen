import java.util.*;
public class main{
  public static void main(Strin[] args){
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int O = scan.nextInt();
        int ans = O-H;
        if(ans>=0){
            System.out.println("unsafe");
        }
        else {
            System.out.println("safe");
        }
  }
}