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
    int currentSum = 0;
    int i = 0, j = 0;
    while(i<N && j < N) {
      if(equal(currentSum, arr[j])) {
        currentSum += arr[j];
        count += (j-i+1);
        j++;
      } else {
        currentSum -= arr[i];
        i++;
        if(i>j) j++;
      }
    }

    System.out.println(count);

    scanner.close();
  }

  private static boolean equal(int a, int b) {
    return (a+b) == (a^b);
  }

}
