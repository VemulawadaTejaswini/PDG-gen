import java.util.*;
public class Main
{ public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    long v=sc.nextLong();
    long d=sc.nextLong();
    long a=sc.nextLong();
    double ab=Math.sqrt(v)+Math.sqrt(d);
    double cd=Math.sqrt(a);
    if(cd>ab)
    System.out.println("Yes");
    else
    System.out.println("No");
}
}