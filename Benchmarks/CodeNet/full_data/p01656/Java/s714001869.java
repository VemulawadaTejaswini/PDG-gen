public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, q, i;
    int[] y;
    String[] name;

    n = sc.nextInt(); q = sc.nextInt();
    y = new int[n]; name = new String[n];
    for(i = 0;i < n;i++){
      y[i] = sc.nextInt(); name[i] = sc.next();
    }
    for(i = 0;i < n;i++)if(q < y[i]){
      if(i == 0)out.println("kogakubu10gokan");
      else out.println(name[i - 1]);
      break;
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}