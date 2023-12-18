import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b,c,d,e,k;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    k=sc.nextInt();
    if(a<=k&&b<=k&&c<=k&&d<=k&&e<=k){
      System.out.println("Yay!");
    }else{
      System.out.println(":(");
    }
  }
}
