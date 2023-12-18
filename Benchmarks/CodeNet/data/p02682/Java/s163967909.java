import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int c = Integer.parseInt(str[2]);
    int k = Integer.parseInt(str[3]);
    
    int sum = 0;
    
    if(k>a){
      sum += a*1;
      k -= a;
    } else if(k<=a){
      sum +=k*1;
      k -= b;
    }
    if(k>b){
      k -= b;
    } else if(k<=b){
      k -= b;
    }
    if(k<c){
      sum += k*-1;      
    } else if(k<=c){
    }
    System.out.println(sum);
  }
}