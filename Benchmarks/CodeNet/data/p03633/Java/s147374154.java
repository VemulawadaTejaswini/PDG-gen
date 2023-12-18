import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    
    long[] a = new long[n];
    
    for (int i=0; i<n; i++){
      a[i] = Long.parseLong(br.readLine());
    }
    long temp = a[0];
    for (long l : a){
      temp = gcm(temp, l);
    }
    System.out.println(temp);
  }
  
  static long gcm(long a, long b){
    return a*(b/lcm(a, b));
  }
  
  static long lcm(long a, long b){
    if (a < b){
      long temp = a;
      a = b;
      b = temp;
    }
    if (a%b==0) return b;
    else return lcm(b, a%b);
  }
}
