import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(w==0 && h==0) break;
            int[][] panel = new int[h][w];
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    panel[i][j] = sc.nextInt();
                }
            }

            int ans = 0;
            int[] dx = {1, 1, -1, -1};
            int[] dy = {1, -1, -1, 1};

            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(panel[i][j]==1){
                        int len = 0;
                        int idx = 0;
                        for(int k=9; k>=1; k--){
                            boolean boo = true;
                            int cnt = 0;
                            int max = -1;
                           
                            for(int d=0; d<4; d++){
                                boo = true;
                               
                                int l = i;
                                while(l != i+k*dy[d]){
                                    int m = j;
                                    while(m != j+k*dx[d]){
                                        if(l<0 || l>=h || m<0 || m>=w || panel[l][m]==0){
                                            boo = false;
                                            break;
                                        }
                                        if(panel[l][m]==1) cnt++;
                                        m += dx[d];
                                    }
                                    if(!boo) break;
                                    l += dy[d];
                                }

                                if(boo){
                                    if(cnt>max){
                                        max = cnt;
                                        idx = d;
                                    }
                                } 
                                cnt = 0;
                            }

                            if(max!=-1){
                                len = k-1;
                                break;
                            }
                        }

                        for(int k=0; k<=len; k++){
                            for(int l=0; l<=len; l++){
                                panel[i+k*dy[idx]][j+l*dx[idx]] = -1;
                            }
                        }
                        ans++;
                    }
                }
            }

            System.out.println(ans);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}