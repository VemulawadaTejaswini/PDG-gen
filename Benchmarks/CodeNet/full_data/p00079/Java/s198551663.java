public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    double[] x, y;
    String s;
    char[] ch;
    int n, i, j, l, r;
    double a;

    x = new double[20]; y = new double[20]; n = 0;
    for(;sc.hasNext();){
      s = sc.next();
      ch = new char[s.length()];
      for(i = 0;i < s.length();i++)ch[i] = s.charAt(i);
      j = 0; l = 0;r = 0;
      for(;j < s.length() + 1;j++){
        if(ch[j] == ','){
          r = j; x[n] = readdouble(ch, l, r); l = ++j; break;
        }
      }
      y[n++] = readdouble(ch, l, s.length());
    }

    a = area(x, y, n);
    if(a < 0)a *= -1;
    out.println(a);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static double readdouble(char[] ch, int l, int r){
    int i;
    double res, d, s;

    s = 1;
    if(ch[l] == '-'){
      s = -1; l++;
    }
    d = 1.0; res = 0.0;
    for(i = l;i < r;i++){
      if(ch[i] == '.')break;
      d *= 10;
    }
    d /= 10;

    for(i = l;i < r;i++){
      if(ch[i] != '.'){
        res += d * (double)(ch[i] - '0');
        d /= 10;
      }
    }
    return res * s;
  }
  private static double area(double[] x, double[] y, int k){
    int i;
    double sum, ax, ay, bx, by;
    sum = 0.0;
    for(i = 0;i < k - 2;i++){
      ax = x[i + 1] - x[0]; ay = y[i + 1] - y[0];
      bx = x[i + 2] - x[0]; by = y[i + 2] - y[0];
      sum += (ax * by - ay * bx) / 2.0;
    }
    return sum;
  }
}