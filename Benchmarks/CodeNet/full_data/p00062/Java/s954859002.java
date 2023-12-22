public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    String s;
    char[] c;
    int i, j;

    c = new char[10];
    for(;sc.hasNext();){
      s = sc.next();
      for(i = 0;i < 10;i++)c[i] = (char)(s.charAt(i) - '0');
      for(i = 0;i < 10 - 1;i++){
        for(j = 0;j < 9 - i;j++){
          c[j] += c[j + 1]; c[j] = (char)(c[j] % 10);
        }
      }
      out.println((char)(c[0] + '0'));
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}