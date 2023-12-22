public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String s;
    int i, n, h, m, sum;
    char[] sch;


    for(;;){
      s = sc.next();
      if("-".equals(s)){
        break;
      }else{
        m = sc.nextInt();
        n = s.length();
        sch = new char[n];
        for(i = 0;i < n;i++){
          sch[i] = s.charAt(i);
        }

        sum = 0;
        for(i = 0;i < m;i++){
          h = sc.nextInt();
          sum += h;
        }

        for(i = 0;i < n;i++){
          System.out.print(sch[(sum + i) % n]);
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