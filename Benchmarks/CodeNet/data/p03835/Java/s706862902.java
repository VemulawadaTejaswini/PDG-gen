import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    
    int k = Integer.parseInt(data[0]);
    int s = Integer.parseInt(data[1]);
    
    int result = 0;
    
    for (int i=0; i<=k; i++){
      for (int j=0; j<=k; j++){
        for (int l=0; l<=k; l++){
          if (i+j+l == s){
            result++;
          }
        }
      }
    }
    System.out.println(result);
  }
}
