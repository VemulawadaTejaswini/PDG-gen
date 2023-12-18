import java.util.*;
public class Main {
	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt(), k = in.nextInt();
      int arr[] = new int[n + 1];
      for(int i = 0; i < k; i ++) {
      	int d = in.nextInt();
        for(int j =0; j < d; j++) {
        	int sn = in.nextInt();
            arr[sn]++;
        }
      }
      int count = 0;
      for(int i = 0; i < n; i++) {
      	if (arr[i] == 0 ) count++;
      }
      System.out.println(count);
    }
}