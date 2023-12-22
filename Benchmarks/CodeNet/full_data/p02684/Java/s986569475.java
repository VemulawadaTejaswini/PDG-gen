import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    long k = Long.parseLong(str[1]);

    str = br.readLine().split(" ");
    int[] arr = new int[n+1];
    for(int i=1; i<=n; ++i)
      arr[i] = Integer.parseInt(str[i-1]);

    int[] next = new int[n+1];
    Arrays.fill(next,-1);

    List<Integer> steps = new ArrayList<>();

    int curr = 1;
    while(next[curr] == -1){
      next[curr] = arr[curr];
      curr = next[curr];
      steps.add(curr);
    }
    if(k <= steps.size()){
      System.out.println(steps.get((int)k-1));
      return;
    }

    int start = curr;
    int len = 0;
    while(arr[curr] != start){
      len++;
      curr = arr[curr];
    }
    int stepsTakenBeforeCycleWasFound = steps.size() - len;
    k -= stepsTakenBeforeCycleWasFound;
    k %= len;
    curr =start;
    while(k !=0){
      curr = arr[curr];
      k--;
    }

    System.out.println(curr);
  }
}
