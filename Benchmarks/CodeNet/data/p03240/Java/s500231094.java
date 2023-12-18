import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            //入力
            int N = scan.nextInt();
            int[] x = new int[N];
            int[] y = new int[N];
            int[] h = new int[N];
            for(int i = 0; i < N; i++){
                x[i] = scan.nextInt();
                y[i] = scan.nextInt();
                h[i] = scan.nextInt();
            }

            int X = 0;
            int Y = 0;
            int H = 0;
            loop: for(int cx = 0; cx <= 100; cx++){
                for(int cy = 0; cy <= 100; cy++){
                    H = h[0] + Math.abs(cx-x[0]) + Math.abs(cy-y[0]);
                    H = getHeight(H, cx, cy, N, h, x, y);
                    if(H != -1){
                        X = cx;
                        Y = cy;
                        break loop;
                    }
                }
            }

            System.out.println(X+" "+Y+" "+H);

        }finally{
            scan.close();
        }
    }

    static int getHeight(int H, int cx, int cy, int N, int[] h, int[] x, int[] y){
        for(int i = 1; i < N; i++){
            if(H != h[i]+Math.abs(cx-x[i])+Math.abs(cy-y[i])){
                H = -1;
                break;
            }
        }
        return H;
    }
}
