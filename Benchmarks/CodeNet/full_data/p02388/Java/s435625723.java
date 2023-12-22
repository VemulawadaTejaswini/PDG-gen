public class Main{
  public void run(java.io.InputStream in,java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*????????§Input*/
    int n;
    n = sc.nextInt();
    sc.close();

/*answer*/
    System.out.println(n * n * n);
  }
  
  public static void main(String[] args){
    (new Main()).run(System.in,System.out);
  }
}