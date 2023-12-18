import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = -1;
        int secondMax = -1;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(max < num) {
                secondMax = max;
                max = num;
            } else if (secondMax < num) {
                secondMax = num;
            }
            a[i] = num;
        }
        for(int num: a) {
          if(num == max) {
              System.out.println(secondMax);
          } else {
              System.out.println(max);
          }
        }
    }
}
