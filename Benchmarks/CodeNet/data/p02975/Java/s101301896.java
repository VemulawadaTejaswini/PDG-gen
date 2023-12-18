import java.util.*;
public class Main{
  public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
    TreeMap<Integer,Integer>m=new TreeMap<Integer,Integer>();
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      int x=sc.nextInt();
      m.put(x,m.containsKey(x)?m.get(x)+1:1);
    }
    boolean b=n%3==0;
    for(int x:m.keySet())
      if(m.get(x)%(n/3)!=0)
        b=false;
    if(m.keySet().size()==1&&m.firstKey()!=0)
      b=false;
    if(m.keySet().size()==2&&(m.firstKey()!=0||m.get(m.firstKey())!=2*n/3))
      b=false;
    if(m.keySet().size()==3&&m.pollFirstEntry().getKey()!=m.firstKey()^m.lastKey())
      b=false;
    System.out.println(b?"Yes":"No");
  }
}