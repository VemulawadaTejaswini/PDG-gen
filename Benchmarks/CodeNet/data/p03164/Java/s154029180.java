import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner ob=new Scanner(System.in);
      int n=ob.nextInt();
      int s=ob.nextInt();
      int w[]=new int[n];
      int v[]=new int[n];
      int ans=0;
      ArrayList<Node>list=new ArrayList<>();
      for(int i=0;i<n;i++)
      {
          w[i]=ob.nextInt();
          v[i]=ob.nextInt();
          list.add(new Node(w[i],v[i]));
      }
      Collections.sort(list,new myComp());
      
     
      for(int i=0;i<n;i++)
      {
          int wt=list.get(i).w;
          int vt=list.get(i).v;
        //   System.out.println(wt+" "+vt+" s="+s);
          if(s>=wt)
          {
              s=s-wt;
              ans=ans+vt;
          }
      }

      System.out.println( ans);
    }
}
class myComp implements Comparator<Node>{
    public int compare(Node n1,Node n2)
    
    {
        if(n1.v!=n2.v)
            return n2.v-n1.v;
        else
            {
                return n2.w-n1.w;
            }
    }
}
class Node{
    int w,v;
    Node(int w,int v)
    {
        this.w=w;
        this.v=v;
    }
}