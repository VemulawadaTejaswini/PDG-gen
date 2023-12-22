import java.util.*;
class Main{
        static int[][] map;
        static int cnt;
        static int w,h;
        static int[] mx = {-1,0,1,-1,1,-1,0,1};
        static int[] my = {-1,-1,-1,0,0,1,1,1};
        static void dfs(int nowx,int nowy){
                for(int i=0;i<8;i++){
                        int nx = nowx + mx[i],ny = nowy + my[i];
                        if(nx<0||nx>=w||ny<0||ny>=h) continue;
                        if(map[ny][nx]==1){
                                map[ny][nx] = 0;
                                dfs(nx,ny);
                        }
                }
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(true){
                		w = sc.nextInt();
                		h = sc.nextInt();
                		if(w+h==0)break;
                        cnt = 0;
                        map = new int[h][w];
                        for(int i=0;i<h;i++){
                                for(int j=0;j<w;j++){
                                        map[i][j] = sc.nextInt();
                                }
                        }


                        for(int i=0;i<h;i++){
                                for(int j=0;j<w;j++){
                                        if(map[i][j]==1){
                                                cnt++;
                                                dfs(i,j);
                                        }
                                }
                        }
                        System.out.println(cnt);
                        
                }
        }
}