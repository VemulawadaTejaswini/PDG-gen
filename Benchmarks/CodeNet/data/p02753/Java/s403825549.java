import java.util.*;
class game
{ public static void main(String args[])
  { Scanner sc=new Scanner (System.in);
     long n=sc.nextLong();
   long a=sc.nextLong();
   long b=sc.nextLong();
   System.out.println((n/(b+a))*a+Math.min(a,n%(b+a)));
}
}

