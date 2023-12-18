import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int time = (A + B) % 24;
    if(time < 10) {
      System.out.println("0"+time+":00");
    }else {
      System.out.println(time + ":00");
    }
  }
}
