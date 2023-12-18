import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    boolean flag = false;
    for(int b=1;b<=n;b++) {
      for(int a=1;a<=b;a++) {
        if(a*b==n) {
          System.out.println((a+b)-2);
          count++;
          break;
        }  
        if(count>0) break;
      }
      if(count>0) break;
    }
}
}
