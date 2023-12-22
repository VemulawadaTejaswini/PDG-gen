public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int[] c;
    int a, max, i;

    c = new int[100];
    for(;sc.hasNext();){
      a = sc.nextInt();
      c[a - 1]++;
    }
    max = 0;
    for(i = 0;i < 100;i++)if(max < c[i])max = c[i];
    for(i = 0;i < 100;i++)if(max == c[i])out.println(i + 1);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}