import java.util.*;
public class Main
{ public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    long c=sc.nextLong();
    long d=sc.nextLong();
    if(((c*d))%2==0)
    System.out.println((c*d)/2);
    else
    System.out.println((c*d)/2+1);
}
}