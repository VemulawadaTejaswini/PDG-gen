import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] S = new String[H];
        
        double[][] D = new double[H][W];
        for(int i = 0; i < H; i++){
            S[i] = sc.next();
        }
        int count = 0;
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(S[i].charAt(j) == '#')
                    count++;
            }
        }
       
        for(int i = 0; i < H; i++){
           Arrays.fill(D[i], Double.POSITIVE_INFINITY);
        }
        D[0][0] = 0;

        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(S[i].charAt(j) == '.'){
                    if(i+1<H && S[i+1].charAt(j) == '.'){
                        D[i+1][j] = Math.min(D[i+1][j], D[i][j]+1);
                    }
                    if(i-1>=0 && S[i-1].charAt(j) == '.'){
                        D[i-1][j] = Math.min(D[i-1][j], D[i][j]+1);
                    }
                    if(j+1<W && S[i].charAt(j+1) == '.'){
                        D[i][j+1] = Math.min(D[i][j+1], D[i][j]+1);
                    }
                    if(j-1>=0 && S[i].charAt(j-1) == '.'){
                        D[i][j-1] = Math.min(D[i][j-1], D[i][j]+1);
                    }
               }
           }
        }

        /*for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }*/
        if(D[H-1][W-1] != Double.POSITIVE_INFINITY)
            System.out.println(H*W-(int)D[H-1][W-1]-count-1);
        else
            System.out.println(-1);
    }
}