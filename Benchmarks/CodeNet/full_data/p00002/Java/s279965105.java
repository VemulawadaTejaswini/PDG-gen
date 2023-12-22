import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner QQ=new Scanner(System.in);
    int a=QQ.nextInt();
    int b=QQ.nextInt();
    int c=a+b;
    int z=0;
    for(;c>0;z++)
    {
      c=c/10;
    }
    System.out.println(z);
    }
}
