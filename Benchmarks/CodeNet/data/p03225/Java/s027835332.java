import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int[][] a = new int[h+w+1][h+w+1];
        
        for(int i=0; i<h; i++){
            String line = sc.next();
            for(int j=0; j<w; j++){
                if(line.charAt(j)=='#'){
                    a[1+i+j][w+i-j] = 1;
                }
            }
        }
        
        int[][] hs = new int[h+w+1][h+w+1];
        int[][] vs = new int[h+w+1][h+w+1];
        
        for(int i=1; i<=h+w; i++){
            for(int j=1; j<h+w; j++){
                hs[i][j] += a[i][j] + hs[i][j-1];
                vs[i][j] += a[i][j] + vs[i-1][j];
            }
        }
        
        long cnt = 0;
        for(int i=0; i<h+w; i++){
            for(int j=0; j<h+w; j++){
                for(int k=j+1; k<h+w; k++){
                    int d = k-j;
                    if(a[i][j]==1 && a[i][k]==1){
                        if(0 <= i-d){
                            cnt += hs[i-d][k] - hs[i-d][j-1];
                            cnt -= a[i-d][j] + a[i-d][k];
                        }
                        if(i+d <= h+w){
                            cnt += hs[i+d][k] - hs[i+d][j-1];
                            cnt -= a[i+d][j] + a[i+d][k];
                        }
                    }
                    if(a[j][i]==1 && a[k][i]==1){
                        if(0 <= i-d){
                            cnt += vs[k][i-d] - vs[j-1][i-d];
                        }
                        if(i+d <= h+w){
                            cnt += vs[k][i+d] - vs[j-1][i+d];
                        }
                    }
                }
            }
        }
        
        System.out.println(cnt);
    }
}

