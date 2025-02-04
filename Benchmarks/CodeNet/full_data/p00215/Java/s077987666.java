import java.util.*;

@SuppressWarnings("unchecked")
class Main{
    static Scanner sc = new Scanner(System.in);

    public static void solve(int w, int h){
        int INF = Integer.MAX_VALUE;
        ArrayList[] list = new ArrayList[5];
        for(int i=0; i<5; i++) list[i] = new ArrayList<int[]>();

        int sx = 0, sy = 0, gx = 0, gy = 0;
        for(int i=0; i<h; i++){
            char[] line = sc.next().toCharArray();
            for(int j=0; j<w; j++){
                if(line[j]=='S'){ sx = j; sy = i;}
                if(line[j]=='G'){ gx = j; gy = i;}
                if(Character.isDigit(line[j])) list[line[j]-'1'].add(new int[]{j, i});
            }
        }

        int midx = 0, min = INF;
        for(int start=0; start<5; start++){
            int[][] dp = new int[5][];
            for(int i=1; i<=4; i++){
                int idx = (start + i) % 5;
                int before = (idx+4) % 5;
                dp[idx] = new int[list[idx].size()];
                Arrays.fill(dp[idx], INF);
                for(int j=0; j<list[idx].size(); j++){
                    int[] pos = (int[])list[idx].get(j);
                    if(i==1){
                        dp[idx][j] = Math.abs(sx - pos[0]) + Math.abs(sy - pos[1]);
                        continue;
                    }
                    for(int k=0; k<list[before].size(); k++){
                        int[] bpos = (int[])list[before].get(k);
                        int dist = dp[before][k] + Math.abs(pos[0] - bpos[0]) + Math.abs(pos[1] - bpos[1]);
                        if(i==4){
                            dist += Math.abs(gx - pos[0]) + Math.abs(gy - pos[1]);
                            if(dist<min){
                                min = dist;
                                midx = start+1;
                            }
                        }
                        dp[idx][j] = Math.min(dp[idx][j], dist);
                    }
                }
            }
        }
        if(min==INF) System.out.println("NA");
        else System.out.println(midx+" "+min);
    }

    public static void main(String[] args){
        while(true){
            int w = sc.nextInt(), h = sc.nextInt();
            if(w==0 && h==0) break;
            solve(w, h);
        }
    }
}