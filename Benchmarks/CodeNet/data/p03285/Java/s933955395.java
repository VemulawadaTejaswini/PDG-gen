import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    if(n==1||n==2||n==3||n==5||n==6||n==9||n==10||n==13||n==17)
      System.out.println("No");
    else
      System.out.println("Yes");
  }
}