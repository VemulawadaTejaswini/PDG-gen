import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
        // i:max length
        for (int i = n / 2; i > 0; i--) {
          // j: search string
          for (int j = 0; j < n - 2*i +1; j++) {
            // serch another string
            for (int k = i + j; k < n - i + 1; k++) {
              // search char
              for (int l = 0; l < i; l++) {
                if (arr[j + l] != arr[k + l]) {
                  break;
                }
                
                if (l == i - 1){
                  System.out.println(i);
                  return;
                }
              }
            }
          }
        }
      System.out.println(0);
    }
}