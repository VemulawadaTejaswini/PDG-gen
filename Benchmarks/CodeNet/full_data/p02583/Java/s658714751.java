import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] l = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    br.close();

    int ans = 0;
    Arrays.sort(l);
    int len = l.length;
    for(int i = 0; i < len; i++){
      for(int j = i + 1; j < len; j++){
        if(l[i] == l[j]) {
          continue;
        }
        for(int k = j + 1; k < len; k++){
          if(l[j] == l[k]) {
            continue;
          }
          if(l[k] < l[i] + l[j]){
            ans++;
          }
        }
      }
    }
    System.out.println(ans);
  }
}