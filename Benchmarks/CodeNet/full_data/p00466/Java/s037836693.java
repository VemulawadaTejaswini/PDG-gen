public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int t, i;

    for(;;out.println(t)){
      t = sc.nextInt(); if(t == 0)break;
      for(i = 0;i < 9;i++)t -= sc.nextInt();
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}