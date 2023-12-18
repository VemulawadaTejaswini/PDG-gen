import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    double ab = Math.sqrt(a*b);
    if(a+b+2*ab<c){
      System.out.print("Yes");
    } else {
      System.out.print("No");
    }
  }
}