import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String[] args){
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      String[] str2 = str.split(" ");
      Array.sort(str2);
      System.out.println(str2[0] + " " + str2[1] + " " + str2[2]);
    } catch (IOException e){
      System.err.println(e.toString());
    }
  }
}
