public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, j, tmp;
    int[] a, b;

    n = sc.nextInt();
    a = new int[n]; b = new int[n];
    for(i = 0;i < n;i++){
      a[i] = sc.nextInt(); b[i] = a[i];
    }
    for(i = 0;i < n - 1;i++)for(j = 0;j < n - 1 - i;j++)if(b[j] > b[j + 1]){
      tmp = b[j]; b[j] = b[j + 1]; b[j + 1] = tmp;
    }
    out.println(solve(n, a, b));

    sc.close();
  }
  private static int solve(int n, int[] a, int[] b){
    int i, l, r, min, max, count, res1, res2;
    boolean x, y;
    l = 0; r = n - 1; count = 0; x = true; y = true;
    for(i = 0;i < n;i++){
      if(a[i] == b[i])count++;
      if(a[i] == b[i] && x)l++;
      else x = false;
      if(a[n - 1 - i] == b[n - 1 - i] && y)r--;
      else y = false;
    }
    if(count == n)return 0;

    min = l; max = l;
    for(i = l;i <= r;i++){
      if(a[min] > a[i])min = i;
      if(a[max] < a[i])max = i;
    }
    reverse(a, l, min);
    res1 = solve(n, a, b);
    reverse(a, l, min);
    reverse(a, max, r);
    res2 = solve(n, a, b);
    reverse(a, max, r);
    if(res1 > res2)res1 = res2;
    return res1 + 1;
  }
  private static void reverse(int[] a, int l, int r){
    int i, tmp;
    for(i = 0;i < (r - l + 1) / 2;i++){
      tmp = a[l + i]; a[l + i] = a[r - i]; a[r - i] = tmp;
    }
    return;
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}