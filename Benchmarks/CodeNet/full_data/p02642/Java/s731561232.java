import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      int max = 0;
      for(int i = 0; i < n; i++) {
      	arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);

      int cnt = 0;
      for(int i = 0; i < n; i++) {
      	if(arr[i] == -1) continue;
      	if(i == 0 && arr[i] == arr[i+1] || i > 0 && arr[i] == arr[i-1])
      		continue;
      	cnt++;
      	for(int j = i+1; j < n ; j++) {
      		if(arr[j] % arr[i] == 0)
      			arr[j] = -1;
      	}
      }
      System.out.println(cnt);
      sc.close();
  }
}