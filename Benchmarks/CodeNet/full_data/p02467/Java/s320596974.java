public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, i;
    n = sc.nextInt();

    System.out.print(n + ":");
    for(;n != 1;){
      for(i = 2;i * i < (n + 1);i++){
        if(n % i == 0){
          System.out.print(" " + i);
          n = n / i;
          break;
        }
      }
      if(i * i > n){
        System.out.print(" " + n);
        break;
      }
    }
    System.out.println();
/*end*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}