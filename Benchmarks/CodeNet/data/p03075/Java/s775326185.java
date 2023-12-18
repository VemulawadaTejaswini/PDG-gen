import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int[] antenna = new int[5];
    for (int i = 0; i < 5; i++){
      antenna[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());
    Arrays.sort(antenna);
    String result = "Yay!";
    if (antenna[4] - antenna[0] > k){
      result = ":(";
    }
    System.out.println(result);
  }
}
