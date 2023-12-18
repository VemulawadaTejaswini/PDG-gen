import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int P = sc.nextInt();
    
    int piece = 3*A+P;
    System.out.println(piece/2);
  }
}