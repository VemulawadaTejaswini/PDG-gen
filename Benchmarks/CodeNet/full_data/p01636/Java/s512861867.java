public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int a, al, ar, i, x, y, count = 0;
    char[] c;
    String s;

    s = sc.next();
    c = new char[s.length() + 1];
    c[0] = '0';
    for(i = 0;i < s.length();i++)c[i + 1] = s.charAt(i);
    for(i = 0;i < s.length();i++){
      if(c[i + 1] != '0'){
        al = readint(c, 0, i + 1); ar = readint(c, i + 1, s.length() + 1);
        x = al + ar; y = ar - al;
        if(x % 2 == 0 && y % 2 == 0 && y >= 0)count++;
      }
    }
    out.println(count);

    sc.close();
  }
  private static int readint(char[] ch, int l, int r){
    int i, d, res, s;
    d = 1; res = 0; s = 1;
    if(ch[l] == '-'){ s = -1; l++; }
    for(i = r - 1;i >= l;i--){
      res += d * (int)(ch[i] - '0');
      d *= 10;
    }
    return res * s;
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}