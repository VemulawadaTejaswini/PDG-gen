public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] a;
    long res;
    int i, min, max;

    n = sc.nextInt();
    a = new int[n];
    for(i = 0;i < n;i++){
      a[i] = sc.nextInt();
    }

    res = 0;
    min = a[0];
    max = a[0];
    for(i = 0;i < n;i++){
      if(min > a[i])min = a[i];
      if(max < a[i])max = a[i];      
      res += (long)a[i];
    }

    System.out.println(min + " " + max + " " + res);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}