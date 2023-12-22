import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    System.out.printf("%.7f %.7f\n",Math.PI*x*2,Math.PI*x*x);
  }
}