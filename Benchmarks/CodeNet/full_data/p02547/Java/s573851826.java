import java.util.*;
class sol{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a,b,c=0;
      for(int i=1;i<=n;i++)
      {
        a=in.nextInt();
        b=in.nextInt();
        if(a==b)
          c++;
      }
      if(c>=3)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}
      