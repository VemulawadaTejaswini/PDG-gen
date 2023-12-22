import java.io.*;

public class Main{
  public static void main(String[]args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
           String[] str = br.readLine().split(" ");
           int a = integer.parseInt(str[0]);
           int b = integer.parseInt(str[1]);
           System.out.println(a * b + "" + (a + b) * 2);
        } catch(IOException e) {
            e.printstackTrace();
        }
  }
}
           