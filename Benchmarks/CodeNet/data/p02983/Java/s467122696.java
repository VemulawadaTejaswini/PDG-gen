import java.util.*;
class Main{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    long l = sc.nextLong();
    long r = sc.nextLong();
    
    if(l-r+1 >= 2019)
      System.out.println(0);
    else
    {
    int ll = (int)l;
      int rr = (int)r;
    long ar[] = new long[(int)(r-l+1)];
    int k = 0;
    for(int i = ll;i <= rr;i++)
    {	
      ar[k] = i%2019;
      k++;
    }
    Arrays.sort(ar);
    System.out.println(ar[0] * ar[1]);
    }
  }
}
  