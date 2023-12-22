public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    String s;
    int i;
    boolean a, b, c, d;
    a = false; b = false; c = false; d = false;
    s = sc.next();
    if(s.length() > 5)a = true;
    for(i = 0;i < s.length();i++){
      if(s.charAt(i) >= '0' && s.charAt(i) <= '9')b = true;
      if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')c = true;
      if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')d = true;
    }
    if(a && b && c && d)out.println("VALID");
    else out.println("INVALID");

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}