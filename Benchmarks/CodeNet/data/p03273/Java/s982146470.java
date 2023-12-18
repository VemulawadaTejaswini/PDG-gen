import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        int[][] a = new int[H][W];

        for(int i = 0; i < H; i++){
            String str = sc.next();
            for(int j = 0; j < W; j++){
                if(str.charAt(j) == '.') a[i][j] = 0;
                else a[i][j] = 1;
            }
        }

        int H_max = H;
        int W_max = W;

        for(int i = 0; i < H; i++){
            int x = 0;
            for(int j = 0; j < W_max; j++){
                x += a[i][j];
            }
            if(x == 0){
                for(int k = i; k < H_max - 1; k++){
                    for(int j = 0; j < W_max; j++){
                        a[k][j] = a[k+1][j]; 
                    }
                }
                H_max --;
            }
        }

        for(int j = 0; j < W_max; j++){
            int x = 0;
            for(int i = 0; i < H_max; i++){
                x += a[i][j];
            }
            if(x == 0){
                for(int k = j; k < W_max - 1; k++){
                    for(int i = 0; i < H_max; i++){
                        a[i][k] = a[i][k+1];
                    }
                }
                W_max --;
            }
        }


        char[][] b = new char[H_max][W_max];
        for(int i = 0; i < H_max; i++){
            for(int j = 0; j < W_max; j++){
                b[i][j] = (a[i][j] == 0)? '.' : '#';
            }
        }

        for(int i = 0; i < H_max; i++){
            for(int j = 0; j < W_max; j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

    }
}