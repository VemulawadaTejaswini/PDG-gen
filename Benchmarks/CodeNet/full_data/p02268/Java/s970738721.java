public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, q;
    int[] s, t;
    int i, j, c, l, r, a;

    n = sc.nextInt();
    s = new int[n];
    for(i = 0;i < n;i++){
      s[i] = sc.nextInt();
    }
    q = sc.nextInt();
    t = new int[q];
    for(i = 0;i < q;i++){
      t[i] = sc.nextInt();
    }

    c = 0;
    for(i = 0;i < q;i++){
      l = 0;
      r = n - 1;
      for(;;){
        a = (l + r) / 2;
        if(t[i] > s[a]){
          l = a;
        }else if(t[i] < s[a]){
          r = a;
        }else{
          c++;
          break;
        }
        if(r - l == 0)break;
      }
    }

    System.out.println(c);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}