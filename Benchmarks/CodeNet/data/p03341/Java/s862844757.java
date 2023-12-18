import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] arr = new int[N];
    for(int i=0;i<N;i++) {
      arr[i] = scanner.nextInt();
    }

    int count = 0;
    for(int i=0;i<N;i++) {
      int currentSum = 0;
      for(int j=i;j<N;j++) {
        if(i==j) {
          currentSum += arr[j];
//          System.out.println(String.format("(%d,%d)", i, j));
          count++;
        } else {
          if((currentSum+arr[j]) == (currentSum^arr[j])) {
//            System.out.println(String.format("(%d,%d)", i, j));
            currentSum += arr[j];
            count++;
          } else {
            break;
          }
        }
      }
    }

    System.out.println(count);

    scanner.close();
  }

}