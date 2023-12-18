import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int r=scanner.nextInt();
    int D=scanner.nextInt();
    int x=scanner.nextInt();

    int ans=x;
    for(int i=0;i<10;i++){
      ans=r*ans-D;
      System.out.println(ans);
    }

  }
}
