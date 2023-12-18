import java.util.*;

public class Main{
  public static void main(String[] args){
    int a=0,b=0,n=0;
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    a = scan.nextInt();
    b = scan.nextInt();

    int kotae1 = a * n;
    int kotae2 = b;


    if(kotae1 >= kotae2){
      System.out.println(kotae2);
    } else if(kotae1 < kotae2){
      System.out.println(kotae1);
    }
  }
}