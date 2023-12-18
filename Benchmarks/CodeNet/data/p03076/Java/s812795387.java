import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] data = new int[5];
    int[] table = new int[5];

    for (int i = 0; i < 5; i++) {
      data[i] = sc.nextInt();
      table[i] = (10-data[i]%10)%10;
    }

    Arrays.sort(table);

    int total = 0;

    for (int i = 0; i < 5; i++) {
      total += data[i] + table[i];
    }

    System.out.println(total-table[4]);


  }

}
