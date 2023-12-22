//import java.lang.annotation.Native;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int w=sc.nextInt();
            int h=sc.nextInt();
            if(h==0&&w==0) break;
            int[][] s=new int[h][w];
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    s[i][j]=sc.nextInt();
                }
            }
            int n=h*w;
            ArrayList<ArrayList<Integer>> g=new ArrayList<ArrayList<Integer>>();
            for(int i=0;i<n;i++){
                g.add(new ArrayList<Integer>());
            }
            int[] ok=new int[n];
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    int now=i*w+j;
                    //G[now]=new ArrayList();
                    
                    if(s[i][j]==1){
                        ok[now]=1;
                        for(int x=-1;x<=1;x++){
                            for(int y=-1;y<=1;y++){
                                if(x==0&&y==0) continue;
                                if(i+x>=0&&i+x<h&&j+y>=0&&j+y<w){
                                    if(s[i+x][j+y]==1)g.get(now).add(w*(i+x)+j+y);
                                }
                            }
                        }
                    }
                }
            }
            int ans=0;
            int[] dist=new int[n];
            for(int i=0;i<n;i++) dist[i]=-1;
            Queue<Integer> que=new LinkedList<Integer>();
            for(int i=0;i<h*w;i++){
                if(ok[i]==0||dist[i]!=-1) continue;
                dist[i]=0;
                que.add(i);
                while(!que.isEmpty()){
                    int v=que.poll();
                    
                        for(int nv:g.get(v)){
                            if(nv>=0&&nv<n&&dist[nv]==-1){
                                dist[nv]=dist[v]+1;
                                que.add(nv);
                            }
                        }
                    
                    
                }
                ans++;
            }
            System.out.println(ans);
        }
    }
}
