public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] r;
    int min, max, tmp, i;

    n = sc.nextInt();
    r = new int[n];
    for(i = 0;i < n;i++){
      r[i] = sc.nextInt();
    }

    min = r[0];
    max = r[1];
    tmp = r[0];
    if(r[1] < r[0])tmp = r[1];
    for(i = 2;i < n;i++){
      if(r[i] - tmp > max - min){
        max = r[i];
        min = tmp;
      }
      if(r[i] < tmp){
        tmp = r[i];
      }
    }

    System.out.println(max - min);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}