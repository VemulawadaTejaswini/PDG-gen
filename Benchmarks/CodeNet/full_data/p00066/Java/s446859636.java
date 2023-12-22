public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    String s;

    for(;sc.hasNext();){
      s = sc.next();
      if(s.charAt(0) == s.charAt(1) && s.charAt(0) == s.charAt(2))
        out.println(s.charAt(0));
      else if(s.charAt(3) == s.charAt(4) && s.charAt(3) == s.charAt(5))
        out.println(s.charAt(0));
      else if(s.charAt(6) == s.charAt(7) && s.charAt(6) == s.charAt(8))
        out.println(s.charAt(0));
      else if(s.charAt(0) == s.charAt(3) && s.charAt(0) == s.charAt(6))
        out.println(s.charAt(0));
      else if(s.charAt(1) == s.charAt(4) && s.charAt(1) == s.charAt(7))
        out.println(s.charAt(0));
      else if(s.charAt(2) == s.charAt(5) && s.charAt(2) == s.charAt(8))
        out.println(s.charAt(0));
      else if(s.charAt(0) == s.charAt(4) && s.charAt(0) == s.charAt(8))
        out.println(s.charAt(0));
      else if(s.charAt(2) == s.charAt(4) && s.charAt(2) == s.charAt(6))
        out.println(s.charAt(0));
      else out.println("d");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}