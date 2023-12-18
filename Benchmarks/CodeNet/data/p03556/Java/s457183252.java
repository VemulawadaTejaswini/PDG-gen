import java.util.Scanner;
public class Main {
  int count = 0;
  public static void main(String[] args) {
    new Main().run();
  }
  void run(){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int i = 1; N >= (i * i); i++){
      count++;
    }
    System.out.println(count * count);
  }
}
