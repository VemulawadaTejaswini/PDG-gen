import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<Integer>[] map = new HashSet[N+1];
        for(int i=0;i<=N;i++) map[i]=new HashSet<>();
        for(int i=1;i<=N-1;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a].add(b);
            map[b].add(a);
        }
        int[] color = new int[N+1];
        color[1]=1; // black is 1
        color[N]=-1; // white is -1;
        boolean isBlack = true;
        LinkedList<Integer> bCur = new LinkedList<>();
        LinkedList<Integer> bNext = new LinkedList<>();
        LinkedList<Integer> wCur = new LinkedList<>();
        LinkedList<Integer> wNext = new LinkedList<>();
        bCur.add(1);
        wCur.add(N);
        while(bCur.size()>0||wCur.size()>0){
            if(isBlack){
                int cur = bCur.poll();
                for(Integer w:map[cur]){
                    if(color[w]==0){
                        color[w]=1;
                        bNext.add(w);
                    }
                }
                if(bCur.size()==0){
                    bCur = bNext;
                    bNext = new LinkedList<>();
                    isBlack = !isBlack;
                }
            } else{
                int cur = wCur.poll();
                for(Integer w:map[cur]){
                    if(color[w]==0){
                        color[w]=-1;
                        wNext.add(w);
                    }
                }
                if(wCur.size()==0){
                    wCur = wNext;
                    wNext = new LinkedList<>();
                    isBlack = !isBlack;
                }
            }
        }
        int bCnt = 0;
        for(int i=1;i<=N;i++){
            if(color[i]==1) bCnt++;
        }
        String ans = "Snuke";
        if(bCnt>N-bCnt) ans = "Fennec";
        System.out.println(ans);
    }
}
