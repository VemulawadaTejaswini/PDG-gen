import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double targ = scan.nextDouble();
    double first = 100.0;
    double rate = 1.01;
    int goal = Math.ceil(Math.log(targ*(rate-1)/first+1)/Math.log(rate));
    System.out.println(goal);
  }
}
