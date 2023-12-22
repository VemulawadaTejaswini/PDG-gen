public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    String a, b;
    char[] ca, cb;
    int i, j, d;

    n = sc.nextInt();
    for(i = 0;i < n;i++){
      a = sc.next();
      b = sc.next();
      d = a.length() + 1;
      if(d < b.length() + 1)d = b.length() + 1;
      ca = new char[d];
      cb = new char[d];

      for(j = 0;j < a.length();j++)
        ca[j] = (char)(a.charAt(a.length() - j - 1) - '0');
      for(j = 0;j < b.length();j++)
        cb[j] = (char)(b.charAt(b.length() - j - 1) - '0');

      for(j = 0;j < d;j++){
        ca[j] += cb[j];
        if(ca[j] > 9){
          ca[j + 1]++;
          ca[j] %= 10;
        }
      }

      if(d > 80 || (d == 80 && ca[d - 1] != 0))out.println("overflow");
      else{
        for(j = 0;j < d;j++)if(j != 0 || ca[d - j - 1] != 0){
          out.print((char)(ca[d - j - 1] + '0'));
        }
        out.println();
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}