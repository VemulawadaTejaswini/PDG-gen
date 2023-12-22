public class Main{
  public void run(java.io.InputStream in,java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);

    int a, b, i, j, dig;
    for(;sc.hasNextInt();){
/*Input*/
      a = sc.nextInt();
      b = sc.nextInt();

/*answer*/
      dig = caldig(a + b);
      System.out.println(dig);
    }
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in,System.out);
  }

  private static int caldig(int n){
    int i;
    for(i = 1;i < 10;i++){
      if(n / 10 == 0)return i;
      n = n / 10;
    }
    return 0;
  }
}