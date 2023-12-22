import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
  //----- ????????????
  public static void main(String[] args) throws java.lang.Exception {
    BufferedReader in = new BufferedReader(
                       new InputStreamReader(System.in));
    String name1 = in.readLine();
    String name2=in.readLine();
    in.close();
    int a1=Integer.parseInt(name1);
    int a2=Integer.parseInt(name2);
    int b=a1*a2;
    int b1=(a1*2)+(a2*2);
    System.out.println(b+" "+b1);
  }
  //----- ???????????§
}