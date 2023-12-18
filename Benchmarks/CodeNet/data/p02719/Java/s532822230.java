    import java.util.*;
    class Main
    {
      public static void main(String args[])
      {
        Scanner sc=new Scanner (System.in);
        int a,b,t=0;
        a=sc.nextInt();
        b=sc.nextInt();
        while(a>b)
        {
          a=Math.abs(a-b);
          t++;
        }
        System.out.println(t);
      }
    }
