import java.util.*;



public class Main {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        //幅優先探索を仕掛けて相手に近づくように駒を動かしていく
        //駒を動かして相手のマスに隣合ったら残りの自分の領域の駒を数えて勝敗判定
        int n=sc.nextInt();
        ArrayList<Integer> l[]= new ArrayList[n];
        int d[]= new int[n];
        int cn[]=new int[n];
        for(int i=0; i<n; i++)
        {
            l[i]=new ArrayList<Integer>();
            d[i]=-1;
            cn[i]=-1;
        }
        for(int i=0; i<n-1; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            l[a-1].add(b-1);
            l[b-1].add(a-1);
        }

        Queue<Integer> bfs = new LinkedList<Integer>();
        //1から捜索開始
        bfs.add(1-1);
        d[0]=0;
        while(!bfs.isEmpty())
        {
            int p = bfs.poll();
            if(p==n-1)
            {
                break;
            }
            //For all possible direction
            for(int i=0; i<l[p].size(); i++)
            {
                int t = l[p].get(i);
                if(d[t]==-1)
                {
                    d[t]=d[p]+1;
                    bfs.add(t);
                }
            }
        }
        //最短経路を調べるぞ
        int root[]=new int[d[n-1]+1];
        root[0]=n-1;
        for(int j=0; j<d[n-1]; j++) {
            for (int i = 0; i < l[root[j]].size(); i++) {
                int t = l[root[0]].get(i);
                if (d[t] == d[root[0]] - 1) {
                    root[i + 1]=t;
                }
            }
        }

        //Fenekの操作可能レベル
        int f=root[(d[n-1]+1)/2-1];
        //Snukeの操作可能レベル
        int s=root[(d[n-1]+1)/2];
        //互いの相関を切る
        l[f].remove(l[f].indexOf(s));
        l[s].remove(l[s].indexOf(f));

        //残ったやつでカウントする

        Queue<Integer> fs = new LinkedList<Integer>();
        //1から捜索開始
        fs.add(1-1);
        cn[0]=0;
        int fcnt=1;
        while(!fs.isEmpty())
        {
            int p = fs.poll();

            //For all possible direction
            for(int i=0; i<l[p].size(); i++)
            {
                int t = l[p].get(i);
                if(cn[t]==-1)
                {
                    cn[t]=0;
                    fcnt++;
                    fs.add(t);
                }
            }
        }
        int scnt=n-fcnt-1;
        if(fcnt>scnt)
        {
            System.out.println("Fennec");
        }
        else
        {
            System.out.println("Snuke");
        }
    }


}

