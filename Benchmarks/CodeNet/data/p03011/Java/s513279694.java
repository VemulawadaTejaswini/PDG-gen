import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();

    int[] data = new int[3];

    data[0] = p + q;
    data[1] = q + r;
    data[2] = r + p;

    int min = data[0];

    for(int i = 0;i < 3;i++) min = Math.min(min,data[i]);

    System.out.println(min);


  }

}
