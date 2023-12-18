import java.io.*;
class Main {
  public static void main() {
    int a,b,c;
    String buf;
    BufferedReader br
      = new BufferedReader(new InputStreamReader(System.in));
    buf = br.readLine();
    a = Integer.parseInt(buf);
    buf = br.readLine();
    b = Integer.parseInt(buf);
    buf = br.readLine();
    c = Integer.parseInt(buf);
    
    String s1 = a+b+c;
    if(s == 557 || s == 575 || s == 755) {
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
  }
}