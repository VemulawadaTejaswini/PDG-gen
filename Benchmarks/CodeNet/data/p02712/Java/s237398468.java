import java.io.*;
 
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(br.readLine());
    
    long result = 0;
    
    for (long i=1; i<=n; i++){
      if (i % 3 != 0 && i % 5 != 0){
        result += i;
      }
    }
    System.out.println(result);
  }
}