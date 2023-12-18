import java.util.Scanner;

/**
 * @author author
 *
 */
public class Main {


  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    Scanner sc1 = new Scanner(System.in);
    
    String st = sc1.nextLine();
    String[] h = st.split(" ");
    // int[] h = Stream.of(st1).mapToInt(Integer::parseInt).toArray();
    
    int returnMax = 0;
    for (int i = 0; i < n - 1; i++) {
      int leftPoint = i;
      int count = 0;
      for (int j = i + 1; j < n; j++) {
        if (Integer.parseInt(h[leftPoint]) >= Integer.parseInt(h[j])) {
          leftPoint = j;
          count++;
          if (returnMax < count) {
            returnMax = count;
            if (returnMax >= (n - i)) {
              break;
            }
          }
        } else {
          break;
        }
      }
      if (returnMax >= (n - i)) {
        break;
      }
    }
    System.out.println(returnMax);

  }

}
