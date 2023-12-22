import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    long[] a = new long[n];
    long sum = 0;
    boolean flg = true;
    String[] str = in.readLine().split(" ");
    for(int i = 0; i < n; i++){
      a[i] = Long.parseLong(str[i]);
      if(i==0){
        sum=a[i];
      } else {
        sum *= a[i];
      }
    }
    System.out.println(sum<Math.pow((long)10,(long)18)?sum:-1);
  }
}