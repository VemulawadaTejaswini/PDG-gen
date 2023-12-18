import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        
        int[][] grd = new int[k*2+1][k*2+1];
        
        for(int i=0; i<n; i++){
            String[] xyc = sc.nextLine().split(" ");
            int x = Integer.parseInt(xyc[0]);
            int y = Integer.parseInt(xyc[1]);
            if(xyc[2].charAt(0) == 'W'){
                y += k;
            }
            grd[y%(k*2)+1][x%(k*2)+1] += 1;
        }
        
        /*
        for(int i=0; i<k*2; i++){
            for(int j=0; j<k*2; j++){
                System.out.print(grd[i][j]);
            }
            System.out.println("");
        }
        */
        
        for(int i=0; i<k*2+1; i++){
            for(int j=0; j<k*2; j++){
                grd[i][j+1] += grd[i][j];
            }
        }
        
        for(int i=0; i<k*2; i++){
            for(int j=0; j<k*2+1; j++){
                grd[i+1][j] += grd[i][j];
            }
        }
        
        int ans = 0;
        for(int i=0; i<=k; i++){
            for(int j=0; j<=k; j++){
                int cnt = 0;
                //iki jkj
                cnt += njrisum(grd, i, j, k, k);
                //i0 j0
                cnt += njrisum(grd, 0, 0, i, j);
                //k2i j0
                cnt += njrisum(grd, i+k, 0, k-i, j);
                //i0 k2j
                cnt += njrisum(grd, 0, j+k, i, k-j);
                //k2i k2j
                cnt += njrisum(grd, i+k, j+k, k-i, k-j);
                
                if(ans < cnt) ans = cnt;
            }
        }
        
        System.out.println(ans);
    }
    
    public static int njrisum(int[][]grd, int i, int j, int h, int w){
        if(h==0 || w==0){
            return 0;
        }
        return grd[i + h][j + w] - grd[i][j + w] - grd[i + h][j] + grd[i][j];
    }
}
