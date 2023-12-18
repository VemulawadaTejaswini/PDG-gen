import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int[] num = new int[3];
    for(int i=0; i<3; i++) {
      num[i] = Integer.parseInt(str[i]);
    }
    
    Arrays.sort(num);
    
    int count = num[2]-num[1];
    count += (num[1]-num[0])/2;
    if((num[1]-num[0])%2!=0)
      count+=2;
    System.out.println(count);
  }
}