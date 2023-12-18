import java.io.*;
class Main {
  public static void main() {
    String a,b,c;
    
    BufferedReader br
      = new BufferedReader(new InputStreamReader(System.in));
    a = br.readLine();
    b = br.readLine();
    c = br.readLine();
    
    String s = a+b+c;
    if(s == "557" || s == "575" || s == "755") {
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
  }
}
