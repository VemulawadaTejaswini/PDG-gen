import java.util.Scanner;
public class Program {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int ch = sc.nextInt();
    int cw = sc.nextInt();

    int total = h*w;
    int black = ch*w + (h-ch)*cw;
    System.out.println(total -black);

  }
}
