public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int w, h, x, y, r;
    w = sc.nextInt();
    h = sc.nextInt();
    x = sc.nextInt();
    y = sc.nextInt();
    r = sc.nextInt();

    if(x >= r && y >= r && w >= (x + r) && h >= (y + r)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}