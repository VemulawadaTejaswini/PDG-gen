import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      String[] str2 = str.split(" ");
      Int[] x = {Integer.parseInt(str2[0]), Integer.parseInt(str2[1]), Integer.parseInt(str2[2])};
      Array.sort(x);
      System.out.println(x[0] + " " + x[1] + " " + x[2]);
    } catch (IOException e){
      System.err.println(e.toString());
    }
  }
}
