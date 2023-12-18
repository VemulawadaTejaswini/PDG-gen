import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn=new Scanner(System.in);

    System.out.print("Aの値:");
    int A=stdIn.nextInt();
     if(100>=A)
      if(A>=0)
       ;
      else
       return;
     else
       return;


    System.out.print("Bの値:");
    int B=stdIn.nextInt();
    if(100>=B)
     if(B>=0)
      ;
     else
      return;
    else
      return;

    System.out.print("Xの値:");
    int X=stdIn.nextInt();
    if(200>=X)
     if(X>=0)
      ;
     else
      return;
    else
      return;

    if(B>=X)
     if(X>=A)
      System.out.println("YES");
     else
      System.out.println("NO");
    else
      System.out.println("NO");


  }
}
