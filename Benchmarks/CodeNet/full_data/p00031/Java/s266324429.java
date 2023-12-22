public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int i, j, k;
    int[] a;

    a = new int[10];
    for(;sc.hasNext();){
      n = sc.nextInt();
      j = 1; k = 0;
      for(i = 0;i < 10;i++){
        if(n % (j * 2) != 0 && i != 9){
          a[k++] = j;
          n -= j;
        }else if(n % (j * 2) != 0 && i == 9)a[k++] = j;
        j *= 2;
      }
      for(i = 0;i < k - 1;i++)out.print(a[i] + " ");
      out.println(a[i]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}