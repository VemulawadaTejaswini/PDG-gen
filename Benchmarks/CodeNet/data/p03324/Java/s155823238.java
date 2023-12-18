import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int n = sc.nextInt();
    double p = (Math.pow(100,d))*n;
    int q = (int)p;
    if(d==0){
      System.out.println(1*n);
    }else if(d==1){
      System.out.println(100*n);
    }else if(d>=2){
      System.out.println(q);
    }
  }
}