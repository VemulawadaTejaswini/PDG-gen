
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] str1 = sc.nextLine().split(" ");
    String[] str2 = sc.nextLine().split(" ");
    int x = Integer.parseInt(str1[0]);
    int n = Integer.parseInt(str1[1]);
    int index = x - 1;

    int[] num = new int[100];

    for(int i = 0 ; i < 100;i++) {
      num[i] = i+1;
    }

    for(int i = 0;i < n;i++) {
      num[Integer.parseInt(str2[i]) - 1] = -1;
    }
    int minIndex = 0;
    int maxIndex = 0;

    for(int i = 0 ; i < 100;i++) {
      if(i < index) {
        if(num[i] != -1) {
          minIndex = i;
        }
      }else {
        if(num[i] != -1) {
          maxIndex = i;
          break;
        }
      }
    }

    int ans = 0;
    if(x - num[minIndex] <= num[maxIndex] - x) {
      ans = num[minIndex];
    }else {
      ans = num[maxIndex];
    }

    System.out.println(ans);

  }

}
