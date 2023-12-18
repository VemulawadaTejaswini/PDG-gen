import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    double ab = 2*Math.sqrt(a*b);
    int d = c - a - b;
    if(4*a*b<Math.pow(d,2)){
      System.out.print("Yes");
    } else {
      System.out.print("No");
    }
  }
}