import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data1 = br.readLine().split(" ");
    int n = Integer.parseInt(data1[0]);
    int m = Integer.parseInt(data1[1]);
    
    String[] data2 = br.readLine().split(" ");
    int[] as = new int[n];
    int sum = 0;
    
    for (int i=0; i<n; i++){
      as[i] = Integer.parseInt(data2[i]);
      sum += as[i];
    }
    int o = 0;
    for (int i : as){
      if (i > sum/(4*m)){
        o++;
      }
    }
    if (o >= m){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
