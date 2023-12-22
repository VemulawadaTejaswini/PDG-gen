public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] a;
    int i, p;

    n = sc.nextInt();
    a = new int[n];
    for(i = 0;i < n;i++){
      a[i] = sc.nextInt();
    }

    p = partition(a, n);

    for(i = 0;i < (n - 1);i++){
      if(i == p){
        System.out.print("[" + a[i] + "] ");
      }else{
        System.out.print(a[i] + " ");
      }
    }
    if(i == p){
      System.out.println("[" + a[i] + "] ");
    }else{
      System.out.println(a[i] + " ");
    }



/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static int partition(int[] a, int n){
    int tmp, k, j;

    for(k = -1;;){
      for(j = k + 1;j < n;j++){
        if(a[j] <= a[n - 1]){
          k++;
          tmp = a[k];
          a[k] = a[j];
          a[j] = tmp;
          if(j == n - 1)return k;
          break;
        }
      }
    }
  }
}