public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    String s;
    char[] c, rc;
    int count, i;

    count = 0;
    for(;sc.hasNext();){
      s = sc.next();
      c = new char[s.length()]; rc = new char[s.length()];
      for(i = 0;i < s.length();i++){
        c[i] = s.charAt(i);
        rc[s.length() - 1 - i] = c[i];
      }

      for(i = 0;i < s.length();i++)if(c[i] != rc[i])break;
      if(i == s.length())count++;
    }
    out.println(count);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}