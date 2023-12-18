import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int o1=a+b;
    int o2=a-b;
    int o3=a*b;

    if (o1>o2) {
      if (o1>o3) {
        System.out.println(o1);
      }else{
        System.out.println(o2);
      }
    }else{
      if (o2>o3) {
        System.out.println(o2);
      }else{
        System.out.println(o3);
      }
    }
  }
}
