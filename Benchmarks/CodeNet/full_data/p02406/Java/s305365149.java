public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int i, x;

    n = sc.nextInt();

    for(i = 0;i < n;i++){
      x = i + 1;
      if(x % 3 == 0){
        System.out.print(" " + x);
      }else{
        for(;;){
          if(x % 10 == 3){
            System.out.print(" " + (i + 1));
            break;
          }else{
            x /= 10;
            if(x == 0)break;
          }
        }
      }
    }
    System.out.println();

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}