import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    ArrayList<String> al=new ArrayList<>();
    Set<String> ss=new TreeSet<>();
    for(int i=0;i<n;i++)
    {
      String s=sc.nextLine();
      al.add(s);
      ss.add(s);
    }
    Iterator<String> itr=ss.iterator();
    int max=-1;
    while(itr.hasNext())
    {
      String t=itr.next();
      if(Collections.frequency(al,t)>max)
     	max=Collections.frequency(al,t);
    }
    itr=ss.iterator();
    while(itr.hasNext())
    {
      String t=itr.next();
      if(Collections.frequency(al,t)==max)
     	System.out.println(t);
    }
  }
}