public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int i, n;
    long p;

    n = sc.nextInt();
    p = 3;
    for(i = 1;i < 21;i++){
      if(n <= p){
        out.println(i); break;
      }
      p *= 3;
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}