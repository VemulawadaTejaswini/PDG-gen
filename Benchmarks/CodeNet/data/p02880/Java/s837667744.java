import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    for(int i = 1; i<=9; i++){
      if((n/i>=1 && n/i<=9) && n%i==0){
        System.out.println("Yes");
        break;
      } else if(i==9 && n%9!=0){
        System.out.println("No");
      }
    }
  }
}