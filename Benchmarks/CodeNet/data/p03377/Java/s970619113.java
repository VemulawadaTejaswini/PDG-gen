import java.util.Scanner;

class Rp1ABC094A {
  public static void main(String[] args) {
    Scanner stdIn=new Scanner(System.in);

    System.out.print("Aの値:");
    int A=stdIn.nextInt();
     
    System.out.print("Bの値:");
    int B=stdIn.nextInt();

    System.out.print("Xの値:");
    int X=stdIn.nextInt();

    if(A+B>=X)
     if(X>A)
      System.out.println("YES");
     else
      System.out.println("NO");
    else
      System.out.println("NO");


  }
}
