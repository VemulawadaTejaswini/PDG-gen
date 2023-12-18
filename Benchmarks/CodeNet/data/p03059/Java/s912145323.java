import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a=scanner.nextInt();
    int b=scanner.nextInt();
    int t=scanner.nextInt();

    int ans=0;
    for(int i=a;i<t+0.5;i+=a){
      ans+=b;
    }

    System.out.println(ans);
  }
}
