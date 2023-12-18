import java.util.*;
public class Main {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int a,b,c;

    int A = sc.nextInt();
    int B = sc.nextInt();

    a = A+B;
    b = A-B;
    c = A*B;

    if((a>b)&&(a>c)){
      System.out.println(a);
    }
    if((b>a)&&(b>c)){
      System.out.println(b);
    }
    if((c>a)&&(c>b)){
      System.out.println(c);
    }

  }
}
