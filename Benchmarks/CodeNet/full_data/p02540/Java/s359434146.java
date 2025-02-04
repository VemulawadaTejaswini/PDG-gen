import java.io.*; import java.util.*;
public class Main {

    public static class Pair {
        int y; int ind;
        public Pair(int b, int c){
            this.y=b; this.ind=c;
        }
        
    }
    static int N;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        Pair[] pr=new Pair[N];
        Pair[] pr2=new Pair[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken())-1;
            int b=Integer.parseInt(st.nextToken())-1;
            pr[a]=new Pair(b,i); pr2[b]=new Pair(a,i);
        }
        int[] rank=new int[N];
        int[] par=new int[N]; int[] siz=new int[N];
        for (int i = 0; i < N; i++) {
            par[i]=i; siz[i]++;
        }
        int k,l; boolean[] done=new boolean[N];
        for (int i = 0; i < N; i++) {//Increasing order of x-coordinate
            //y[i] is known
            if(done[i])continue;
            for (int j = pr[i].y+1; j < N; j++) {
                //merge pr[i].ind and pr2[j].ind
                if(pr2[j].y>i){
                    done[pr2[j].y]=true;
                    k=find(pr[i].ind,par); l=find(pr2[j].ind,par);
                    if(k!=l){
                        if(rank[k]>rank[l]){
                            par[l]=k; siz[k]+=siz[l];
                        }else if(rank[k]==rank[l]){
                            rank[l]++; par[k]=l; siz[l]+=siz[k];
                        }else{
                            par[k]=l; siz[l]+=siz[k];
                        }
                    }
                }
                
                
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(siz[find(i,par)]).append("\n");
        }
        System.out.println(sb.toString());
    }
    public static int find(int x, int[] p){
        if(p[x]==x)return x;
        int ans=find(p[x],p); p[x]=ans; return ans;
    }
}
