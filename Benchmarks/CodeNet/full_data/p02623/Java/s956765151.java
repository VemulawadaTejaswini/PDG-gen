import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    long k = Long.parseLong(str[2]);
    str = in.readLine().split(" ");
    int[] a = new int[n];
    int[] b = new int[m];
    int count = 0;
    long sum = 0;
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
    }
    str = in.readLine().split(" ");
    for(int i=0; i<m; i++) {
      b[i] = Integer.parseInt(str[i]);
     }
    for(int i=0,j=0; i<n && j<m;){
      if(a[i]<b[j]) {
        sum+=a[i];
        a[i] = 0;
        i++;
      } else {
        sum+=b[j];
        b[j] = 0;
        j++;
      }
      
      if(sum<=k) { 
        count += 1;
      } else {
        break;
      }
    }
    
    for(int i=0; i<n; i++) {
      if(a[i]!=0 && sum+a[i]<=k) {
        count += 1;
        sum += a[i];
      }
    }
    for(int i=0; i<m; i++) {
       if(b[i]!=0 && sum+b[i]<=k) {
        count += 1;
        sum += b[i];
       }
    }
    System.out.println(count);
  }
}