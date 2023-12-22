import java.math.BigInteger;
public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);

    for(int n = sc.nextInt();n-- > 0;){
      BigInteger a = sc.nextBigInteger().add(sc.nextBigInteger());
      if((a.toString()).length() >= 80)out.println("overflow");
      else out.println(a);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}