import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      String str = br.readLine();
      String str2[] = str.split(" ");
      int a = Integer.parseInt(str2[0]);
      int b = Integer.parseInt(str2[1]);
      System.out.println(a*b + " " + (a+b)*2);
      br.close();
    } catch (IOException e){
      System.err.println(e.toString());
    }
  }
}
