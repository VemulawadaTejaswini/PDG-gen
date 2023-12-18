import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        int[][] fields = new int[H][W];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                fields[i][j] = sc.nextInt();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                
                if( fields[i][j] % 2 == 0 ) continue;
                
                if( j + 1 < W && fields[i][j] % 2 == 1 ){
                    fields[i][j]--;
                    fields[i][j+1]++;
                    sb.append( (i+1) + " " + (j+1) + " " + (i+1) + " " + (j+2) ).append("\r\n");
                } else if( i + 1 < H ){
                    fields[i][j]--;
                    fields[i+1][j]++;
                    sb.append( (i+1) + " " + (j+1) + " " + (i+2) + " " + (j+1) ).append("\r\n");
                }
            }
        }
        
        System.out.println(sb.toString());
        
    }
}
