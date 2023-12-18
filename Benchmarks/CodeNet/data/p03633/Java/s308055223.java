import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] box = new long[n];
    for (int i = 0; i < n; i++) {
       box[i] = sc.nextLong();
    }
    Arrays.sort(box);
    long ans = box[n - 1];
    boolean flg = false;
    int j = 0;
    while(flg == false) {
        j++;
        ans = ans * j;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(ans % box[i] == 0) {
                count++;
            }
        }
        if(count == box.length) {
            flg = true;
        }
    }
    System.out.println(ans);
  }
}