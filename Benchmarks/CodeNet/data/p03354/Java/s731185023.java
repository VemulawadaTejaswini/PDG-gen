import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p[] = new int[n];
        for (int i = 0;i < n;++i){
            p[i] = sc.nextInt();
        }
        Pair pairs[] = new Pair[m];
        int connects[] = new int[n + 1];
        int c = 1;
        for (int i = 0;i < m;++i){
            pairs[i] = new Pair(sc.nextInt(),sc.nextInt());
            if(connects[pairs[i].x] == 0&&connects[pairs[i].y] == 0){
                connects[pairs[i].x] = c;
                connects[pairs[i].y] = c;
                ++c;
            }
            else if(connects[pairs[i].x] == 0){
                connects[pairs[i].x] = connects[pairs[i].y];
            }
            else if(connects[pairs[i].y] == 0){
                connects[pairs[i].y] = connects[pairs[i].x];
            }
            else{
                int q = connects[pairs[i].y];
                int r = connects[pairs[i].x];
                for (int j = 0;j < n;++j){
                    if(connects[j] == q){
                        connects[j] = r;
                    }
                }
                connects[pairs[i].y] = r;
            }
        }
        int total = 0;
        for (int i = 1;i <= n;++i){
            if(connects[i] == -1)continue;
            int q = connects[i];
            connects[i] = -1;
            ArrayList<Integer> con = new ArrayList<>();
            con.add(i);
            for (int j = i + 1;j <= n;++j){
                if(connects[j] == q){
                    con.add(j);
                    connects[j] = -1;
                }
            }
            for (int j = 0;j < con.size();++j){
                for (int k:con){
                    if(p[con.get(j) - 1] == k){
                        ++total;
                    }
                }
            }
        }
        System.out.println(total);
    }

    static class Pair{
        public int x;
        public int y;
        public Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }






}