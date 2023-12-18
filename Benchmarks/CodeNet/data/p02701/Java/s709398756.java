import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    int t;
    Scanner sc=new Scanner(System.in);
    Set<String> st=new HashSet<>();
    t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
          st.add(sc.next());}
    System.out.println(st.size());
  }}