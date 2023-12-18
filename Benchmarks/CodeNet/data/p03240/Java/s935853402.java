import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        long[] h = new long[N];
        
        int cnth = 0;
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextLong();
            if(h[i] > 0){
                cnth++;
            }
        }

        boolean bl = false;
        int ansx = 0;
        int ansy = 0;
        long ansh = 0;
        for(int cx = 0; cx <= 100; cx++){
            for(int cy = 0; cy <= 100; cy++){
                bl = true;
                long[] hh = new long[cnth];
                int index = -1;
                for(int i = 0; i < N; i++){
                    if(h[i] > 0){
                        hh[++index] = h[i] +  Math.abs(cx - x[i]) + Math.abs(cy - y[i]);
                    }
                }
                if(cnth > 0){
                    for(int i = 1; i < cnth; i++){
                        if(hh[i-1] != hh[i]){
                            bl = false;
                        }
                    }
                }
                if(bl == true){
                    long ch = hh[0];
                    for(int i = 0; i < N ; i++){
                        if(h[i] == 0){
                            if(ch > Math.abs(cx - x[i]) + Math.abs(cy - y[i])){
                                bl = false;
                            }
                        }
                    }
                    if(bl == true){
                        ansx = cx;
                        ansy = cy;
                        ansh = ch;
                        break;
                    }
                }
                else{
                    break;
                }
            }
        }
        System.out.println(ansx + " " + ansy + " " + ansh);
    }
}