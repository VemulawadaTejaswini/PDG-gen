import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int happy = (X/500 * 1000) + (X%500/5*5);
    System.out.print(happy);
  }
}