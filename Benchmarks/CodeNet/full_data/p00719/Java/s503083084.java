import java.util.*;

public class Main{
    public static edge[][] V=new edge[30][30];
    
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        while(true){
            int n=cin.nextInt();
            if(n==0)break;
            int m=cin.nextInt();
            int p=cin.nextInt();
            int a=cin.nextInt()-1;
            int b=cin.nextInt()-1;
            int[] ti=new int[n];
            int[] Vs=new int[m];
            for(int i=0;i<n;i++)ti[i]=cin.nextInt();

            Arrays.fill(Vs,0);

            for(int i=0;i<p;i++){
                int x=cin.nextInt()-1;
                int y=cin.nextInt()-1;
                int z=cin.nextInt();
                V[x][Vs[x]++]=new edge(y,z);
                V[y][Vs[y]++]=new edge(x,z);
            }
            Queue<node> q=new PriorityQueue<node>();
            q.add(new node(0,a,0));

            double[][] vis=new double[m][1<<n];
            Boolean[][] fix=new Boolean[m][1<<n];
            for(int i=0;i<m;i++){
                Arrays.fill(vis[i],1<<28);
                Arrays.fill(fix[i],false);
            }
            
            double ans=-1;
            
            while(q.isEmpty()==false){
                node cn=q.poll();

                if(fix[cn.v][cn.st])continue;
                fix[cn.v][cn.st]=true;
                if(cn.v==b){
                    ans=cn.cc;
                    break;
                }

                for(int i=0;i<n;i++){
                    if(((cn.st>>i)&1)==1)continue;
                    for(int j=0;j<Vs[cn.v];j++){
                        int nv=V[cn.v][j].v;
                        int tc=V[cn.v][j].c;
                        int nst=cn.st|(1<<i);
                        double nc=cn.cc+1.0*tc/ti[i];                        
                        if(vis[nv][nst]<=nc)continue;
                        vis[nv][nst]=nc;
                        q.add(new node(nc,nv,nst));
                    }
                }
            }
            if(ans<0)System.out.println("Impossible");
            else System.out.println(ans);
        }
    }

    public static class edge{
        public int v,c;
        public edge(int iv,int ic){
            v=iv;
            c=ic;
        }
    }
}

class node implements Comparable<node>{
    public double cc;
    public int v,st;
    public node(double icc,int iv,int ist){
        cc=icc;
        v=iv;
        st=ist;
    }
    public int compareTo(node s){
        if(cc>s.cc)return 1;
        else if(cc<s.cc)return -1;
        else return 0;
    }
}