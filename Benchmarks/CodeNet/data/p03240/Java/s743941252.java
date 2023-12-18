import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];
        
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        boolean bl = false;
        int ansx = 0;
        int ansy = 0;
        int ansh = 0;
        for(int xx = 0; xx <= 100; xx++){
            for(int yy = 0; yy <= 100; yy++){
                bl = true;
                int hh = h[0] + Math.abs(xx - x[0]) + Math.abs(yy - y[0]);
                for(int i = 1; i < N; i++){
                    if(hh != h[i] + Math.abs(xx - x[i]) + Math.abs(yy - y[i])){
                        bl = false;
                    }
                }
                if(bl == true){
                    ansx = xx;
                    ansy = yy;
                    ansh = hh;
                }
            }
        }

        System.out.println(ansx + " " + ansy + " " + ansh);
    }
}