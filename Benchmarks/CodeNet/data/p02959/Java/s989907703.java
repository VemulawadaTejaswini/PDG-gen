import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] line = br.readLine().split(" ");
    int[] monsters = new int[n+1];
    int i;
    for(i=0; i<=n; i++)
      monsters[i] = Integer.parseInt(line[i]);
    line = br.readLine().split(" ");
    int[] braves = new int[n];
    for(i=0; i<n; i++)
      braves[i] = Integer.parseInt(line[i]);
    
    int count = 0;
    int tmp, tmp2;
    for(i=0; i<n; i++){
      tmp = braves[i];
      tmp -= Math.min(tmp, monsters[i]);
      tmp2 = Math.min(tmp, monsters[i+1]);
      tmp -= tmp2;
      monsters[i+1] -= tmp2;
      count += braves[i] - tmp;
    }
    System.out.println(count);
  }
}
