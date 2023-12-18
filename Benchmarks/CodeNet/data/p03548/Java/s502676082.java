import java.util.Scanner;
public class Main {
  int count = 0;
  public static void main(String[] args) {
    new Main().run();
  }
  public void run() {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    X = X - Z;
    while(X >= 0){
      X = X - (Y + Z);
      count++;
    }
    if(count == 0){
      System.out.println(0);
    }else{
      System.out.println(count - 1);
    }
  }
}
