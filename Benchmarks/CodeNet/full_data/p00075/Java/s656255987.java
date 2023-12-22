public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    String s;
    char[] c;
    int l, i, a, count;
    double w, h;

    count = 0; a = 0; w = 0; h = 0;
    for(;sc.hasNext();){
      s = sc.next(); c = new char[s.length()];
      for(i = 0;i < s.length();i++)c[i] = s.charAt(i);
      l = 0;
      for(i = l;i < s.length();i++)if(c[i] == ',')break;
      a = readint(c, l, i); l = ++i;
      for(i = l;i < s.length();i++)if(c[i] == ',')break;
      w = readdouble(c, l, i);
      l = ++i;
      h = readdouble(c, l, s.length());

      if(w / h / h >= 25.0){
        out.println(a); count++;
      }
    }
    if(count == 0)out.println("????????????");

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
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

  private static double readdouble(char[] ch, int l, int r){
    int i;
    double res, d, s = 1;
    if(ch[l] == '-'){ s = -1; l++; }
    d = 1.0; res = 0.0;
    for(i = l;i < r;i++){
      if(ch[i] == '.')break;
      d *= 10;
    }
    d /= 10;
    for(i = l;i < r;i++)if(ch[i] != '.'){
      res += d * (double)(ch[i] - '0');
      d /= 10;
    }
    return res * s;
  }
}