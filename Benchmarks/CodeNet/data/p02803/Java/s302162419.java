import java.lang.Math;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        int inf = 1000000000;

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        String[] meiro = new String[h];

        for(int i = 0; i < h; i++){
            meiro[i] = sc.next();
        }

        int[][] grh = mapping(h,w,meiro);
        int size = grh[0].length;

        // grh[0] = daik(grh,0);

        System.out.print(war(grh));
    }

    static int war(int[][] map){
        int inf = 1000000000;
        int ans = 0;
        int n = map[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    map[j][k] = Math.min(map[j][k],map[j][i]+map[i][k]);
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans = Math.max(ans,map[i][j]);
            }
        }
        return ans;
    }

    static int[][] mapping(int h,int w,String[] meiro){
        int inf = 1000000000;

        char[][] Meiro = new char[h][w];
        int size = 0;
        int[] ichi = new int[h*w];
        for(int i = 0; i < h; i++){
            Meiro[i] = meiro[i].toCharArray();

            for(int j = 0; j < w; j++){
                if(Meiro[i][j] == '.'){
                    ichi[size] = i*w + j;
                    size++;
                }
            }
        }
        System.out.print("\n\n");

        int[][] grh = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                grh[i][j] = inf;
            }
        }

        for(int i = 0; i < size; i++){
            grh[i][i] = 0;
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < i; j++){
                if(ichi[j]/w==ichi[i]/w && Math.abs(ichi[j]-ichi[i]) == 1){
                    grh[i][j] = 1;
                    grh[j][i] = 1;
                }
                if(ichi[j] % w == ichi[i] % w && Math.abs(ichi[j] / w - ichi[i] / w ) == 1){
                    grh[i][j] = 1;
                    grh[j][i] = 1;
                }
                
            }
        }
        return grh;
    }
}