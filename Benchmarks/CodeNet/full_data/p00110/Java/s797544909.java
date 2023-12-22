public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int i, a, b, x, p, e;
    String s;
    char[] c;

    p = 0;e = 0;
    for(;sc.hasNext();){
      s = sc.next();
      c = new char[s.length()];
      for(i = 0;i < s.length();i++){
        c[i] = s.charAt(i);
        if(c[i] == '+')p = i;
        if(c[i] == '=')e = i;
      }
      for(x = 0;x < 10;x++){
        a = readintx(c, 0, p, x); b = readintx(c, p + 1, e, x);
        if(a + b == readintx(c, e + 1, s.length(), x))break;
      }
      if(x == 10)out.println("NA");
      else out.println(x);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int readintx(char[] c, int l, int r, int x){
    int i, d, res, s;
    d = 1; res = 0; s = 1;
    if(c[l] == '-'){ s = -1; l++; }
    for(i = r - 1;i >= l;i--){
      if(c[i] == 'X') res += d * x;
      else res += d * (int)(c[i] - '0');
      d *= 10;
    }
    return res * s;
  }
}