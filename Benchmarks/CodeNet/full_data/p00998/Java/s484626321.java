public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, q;
    int[] a;
    int x, y, z;
    int i, j, min, tmp;

    n = sc.nextInt();
    q = sc.nextInt();
    a = new int[n];
    for(i = 0;i < n;i++)a[i] = sc.nextInt();

    for(i = 0;i < q;i++){
      x = sc.nextInt();
      y = sc.nextInt();
      z = sc.nextInt();

      if(x == 0){
        tmp = a[z];
        for(j = z;j > y;j--)a[j] = a[j - 1];
        a[y] = tmp;
      }else if(x == 1){
        min = a[y];
        for(j = y;j <= z;j++){
          if(min > a[j])min = a[j];
        }
        System.out.println(min);
      }else{
        a[y] = z;
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}