import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double targ = scan.nextDouble();
    double first = 100.0;
    double rate = 1.01;
    double goal = Math.log((targ*(rate-1)/first+1))/Math.log(rate);
    double g = Math.ceil(goal) + 1;
    int x = (int)g;
    System.out.println(x);
  }
}
