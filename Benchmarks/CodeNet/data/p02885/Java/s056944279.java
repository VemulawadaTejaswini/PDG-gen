import java.util.*;
public class Main{
  public static void main(String[] args) {
    int a,b;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();

    if(a>2*b){
      System.out.println(a-2*b);
    }else{
      System.out.println(0);
    }
  }
}
