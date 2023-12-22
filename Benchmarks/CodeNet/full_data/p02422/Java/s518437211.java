public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String str, call, p;
    int q, a, b;
    char[] stch, pch;
    int i, j, n, pn;
    char tmp;

    str = sc.next();
    q = sc.nextInt();
    n = str.length();
    stch = new char[n];
    for(i = 0;i < n;i++){
      stch[i] = str.charAt(i);
    }

    for(i = 0;i < q;i++){
      call = sc.next();
      if("replace".equals(call)){
        a = sc.nextInt();
        b = sc.nextInt();
        p = sc.next();

        pn = p.length();
        pch = new char[pn];
        for(j = 0;j < pn;j++){
          pch[j] = p.charAt(j);
        }

        for(j = a;j <= b;j++){
          stch[j] = pch[j - a];
        }
      }else if("reverse".equals(call)){
        a = sc.nextInt();
        b = sc.nextInt();
        for(j = 0;j < (b - a) / 2;j++){
          tmp = stch[a + j];
          stch[a + j] = stch[b - j];
          stch[b - j] = tmp;
        }
      }else if("print".equals(call)){
        a = sc.nextInt();
        b = sc.nextInt();
        for(j = a;j <= b;j++){
          System.out.print(stch[j]);
        }
        System.out.println();
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}