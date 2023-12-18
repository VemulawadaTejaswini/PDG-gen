import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x[] = new int[N];
        int y[] = new int[N];
        int h[] = new int[N];
        for(int i = 0; i < N; i++){
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
            h[i] = scanner.nextInt();
        }

        for(int Cx = 0; Cx <= 100; Cx++){
            for(int Cy = 0; Cy <= 100; Cy++){
                int kh = -1;
                boolean f = false;
                for(int i = 0; i < N; i++){
                    if(h[i] > 0){
                        kh = h[i] + Math.abs(Cx - x[i]) + Math.abs(Cy -y[i]);
                        break;
                    }
                }
                for(int i = 0; i < N; i++){
                    int eh = Math.max(kh - Math.abs(x[i] - Cx) - Math.abs(y[i] - Cy), 0);
                    if(eh != h[i]){
                        f = true;
                        break;
                    }
                }

                if(f){
                    continue;
                }else{
                    System.out.printf("%d %d %d", Cx, Cy, kh);
                }
            }
        }

    }

}