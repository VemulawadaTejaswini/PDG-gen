import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    long a = Integer.parseInt(str[0]);
    long b = Integer.parseInt(str[1]);
    long c = Integer.parseInt(str[2]);
    long k = Integer.parseInt(str[3]);
    
    int sum = 0;
    
    if(k-a>=0){
      sum += a*1;
      k -= a;
    } else if(k<a && k>0){
      sum +=k*1;
    }
    if(k-b>=0 && k!=0){
      k -= b;
    } 
    if(k-c>=0 && k!=0){
      sum += c*-1;
    } else if(k<c && k>0){
      sum += k*-1;      
    }
    System.out.println(sum);
  }
}