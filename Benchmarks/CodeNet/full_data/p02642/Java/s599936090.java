
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if(n == 1) {
      System.out.println(1);
    }else {
      sc.nextLine();
      String[] str = sc.nextLine().split(" ");

      ArrayList<Integer> aList = new ArrayList<Integer>();
      for(int i = 0;i < n;i++) {
        aList.add(Integer.parseInt(str[i]));
      }
      Collections.sort(aList);
      if(aList.contains(1)) {
        if(aList.get(1) != 1) {
          System.out.println(1);
        }else {
          System.out.println(0);
        }
      }else {
        int max = Collections.max(aList);
        boolean[] bArray = new boolean[max+1];
        int cnt = 0;

        for(int i = 0;i < max+1 ; i++) {
          if(aList.contains(i)) {
            bArray[i] = true;
            cnt++;
          }else {
            bArray[i] = false;
          }
        }

        for(int i = 1;i < n;i++) {
          if(bArray[aList.get(i)]) {
            for(int j = 0;j < i;j++) {
              if(aList.get(i) % aList.get(j) == 0) {
                int c = 1;
                for(int k = aList.get(i);k <= max; k = c * aList.get(i)) {
                  if(aList.contains(k)) {
                    bArray[k] = false;
                    cnt--;
                  }
                  c++;
                }
                break;
              }
            }
          }
        }

        System.out.println(cnt);
    }

    }

  }
}
