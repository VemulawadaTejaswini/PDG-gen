import java.io.*;

class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(
                       new InputStreamReader(System.in));
    String x=in.readLine();
    String y=in.readLine();
    int a1 = Integer.parseInt(x);
    int a2 = Integer.parseInt(y);

    int b=a1*a2;
    int b1=(a1*2)+(a2*2);
    System.out.println(b+" "+b1);
  }
}