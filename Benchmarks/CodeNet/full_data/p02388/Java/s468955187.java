import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = br.readLine();
    System.out.println(Integer.parseInt(Math.pow(x, 3)));
  }
}
