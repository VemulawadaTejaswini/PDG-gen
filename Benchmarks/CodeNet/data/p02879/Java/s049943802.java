import java.util.Scanner;

public class a{
  public static void main(String args[]) throws Exception{
    Scanner scan=new Scanner(System.in);
    int A=Integer.parseInt(scan.next());
    int B=Integer.parseInt(scan.next());
    if ((1<=A && A<=9)&&(1<=B && B<=9)){
      System.out.println(A*B);
    }
    else{
      System.out.println(-1);
    }
  }
}
