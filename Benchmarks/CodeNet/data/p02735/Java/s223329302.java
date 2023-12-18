import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int H = sn.nextInt();
        int W = sn.nextInt();
        String[][] S = new String[H][W];
        int r0 = 0;
        int r1 = H-1;
        int c0 = 0;
        int c1 = W-1;
        int cnt = 0;

        for(int i=0; i<H; i++){
            String s = sn.next();
            for(int j=0; j<W; j++){
                S[i][j] = s.substring(j, j+1);
            }
        }

        if(S[0][0].equals("#")){
            cnt++;
        }

        while(!(r0 == r1 && c0 == c1)){
            if(c0 == c1){
                if(S[r0+1][c0].equals("#")){
                    cnt++;
                }
                r0++;
            }else if(r0 == r1){
                if(S[r0][c1].equals("#")){
                    cnt++;
                }
                c0++;
            }else{
                if(S[r0][c0+1].equals(".")){
                    c0++;
                }else if(S[r0+1][c0].equals(".")){
                    r0++;
                }else{
                    c0++;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}