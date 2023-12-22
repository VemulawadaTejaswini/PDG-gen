import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str;
    int h,m;
    while(true){
      str = sc.next();
      if(str.equals("-")) break;
      m = sc.nextInt();
      for(;m>0;m--){
           h = sc.nextInt();
           String a,b;
           a = str.substring(0,h);
           b = str.substring(h);
           str = b + a;
        }
      System.out.println(str);
    }
    sc.close();
  }
}
