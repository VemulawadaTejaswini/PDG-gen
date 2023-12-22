import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double targ = scan.nextDouble();
    double first = 100.0;
    double rate = 1.01;
    int i = 100;
    int goal = 0;
    while (i <= targ){
      i*=rate;
      int i=Math.ceil(i);
      goal++;
    System.out.println(goal);
  }
}
