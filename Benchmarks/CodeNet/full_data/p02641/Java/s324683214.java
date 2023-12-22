import java.util.*;

public class Main{
public static void main(String[] args)
{ 
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int n=sc.nextInt();
  Set<Integer> set =new Set<>();
  for(int i=0;i<n;i++)
    set.add(sc.nextInt());
  int ans=0;
  for(int i=x;;i++)
  {
    if(!set.contains(i+1))
    { ans=i+1;
     break;}
    else if(!set.contains(i-1))
    {ans=i-1
      break}
  }

  System.out.println(ans);
}
 
}
