public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int i, j;

    for(;sc.hasNext();){
      n = sc.nextInt();
      j = 1;
      for(i = 0;i < 10;i++){
        if(n % (j * 2) != 0 && i != 9){
          out.print(j + " ");
          n -= j;
        }else if(n % (j * 2) != 0 && i == 9)out.print(j);
        j *= 2;
      }
      out.println();
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}