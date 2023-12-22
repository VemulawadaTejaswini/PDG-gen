public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int x, y, w, h, n, m;
    int[] cx, cy;
    int i, j, count;

    m = sc.nextInt();

    for(i = 0;i < m;i++){
      x = sc.nextInt();
      y = sc.nextInt();
      w = sc.nextInt();
      h = sc.nextInt();
      n = sc.nextInt();
      count = 0;
      cx = new int[n];
      cy = new int[n];      

      for(j = 0;j < n;j++){
        cx[j] = sc.nextInt();
        cy[j] = sc.nextInt();
      }

      for(j = 0;j < n;j++){
        if(x <= cx[j] && cx[j] <= (x + w) && y <= cy[j] && cy[j] <= (y + h)){
          count++;
        }
      }

      System.out.println(count);
    }

    sc.close();

  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}