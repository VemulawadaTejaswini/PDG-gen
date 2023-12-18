import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }

        int startx = 0;
        int endx = W;
        int starty = 0;
        int endy = H;
        for(int i = 0; i < N; i++){
            if(endx - startx <= 0 || endy - starty <= 0) break;
            else if(a[i] == 1){
                startx = x[i];
            }
            else if(a[i] == 2){
                endx = x[i];
            }
            else if(a[i] == 3){
                starty = y[i];
            }
            else if(a[i] == 4){
                endy = y[i];
            }
        }

        if(endx - startx <= 0 || endy - starty <= 0) System.out.println("0");
        else System.out.println((endx - startx) * (endy - starty));
        
    }
}
