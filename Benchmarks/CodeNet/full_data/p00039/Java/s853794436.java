public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int i, sum, a, b;
    String s;

    for(;sc.hasNext();){
      s = sc.nextLine();

      a = resrf(s.charAt(0)); b = a; sum = 0;
      for(i = 1;i < s.length();i++){
        b = resrf(s.charAt(i));
        if(a < b)sum -= a;
        else sum += a;
        a = b;
      }
      sum += b;
      out.println(sum);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int resrf(char c){
    if(c == 'I')return 1;
    else if(c == 'V')return 5;
    else if(c == 'X')return 10;
    else if(c == 'L')return 50;
    else if(c == 'C')return 100;
    else if(c == 'D')return 500;
    else return 1000;
  }
}