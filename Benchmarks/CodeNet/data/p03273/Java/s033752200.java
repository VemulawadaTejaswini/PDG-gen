import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int H = stdIn.nextInt();
        int W = stdIn.nextInt();
        char[][] a = new char[H][W];
        int[] h = new int[W];
        int[] w = new int[H];
        int counth = W;
        int count= H;
        boolean[] trushW = new boolean[W];
        boolean[] trushH = new boolean[H];
        for(int i=0; i < H;i++){
            String s = stdIn.next();
            w[i]=0;
            trushH[i] = true;
            for(int j=0; j<W;j++){
                a[i][j] = s.charAt(j);
                if(a[i][j] == '#')w[i]+=1;
                else w[i] -= 1;
            }
            if(w[i]==counth||w[i] == -counth){
                trushH[i]=false;
            }
        }
        for(int i =0; i<W;i++){
            trushW[i] = true;
            h[i] = 0;
            for(int j=0; j<H;j++){
               if(a[j][i] == '#')h[i]+=1;
                else h[i] -= 1; 
            }
            if(h[i]==count||h[i] == -count){
                trushW[i]=false;
            }
        }
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(trushH[i]&&trushW[j])System.out.print(a[i][j]);
            }
            if(trushH[i])System.out.println();
        }
    }
}
