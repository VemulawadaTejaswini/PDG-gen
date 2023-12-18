import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        int[][] a = new int[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                a[i][j] = sc.nextInt() % 2;
            }
        }
        for(int i = 0; i < h; i++){
            if(i % 2 == 0){
                for(int j = 0; j < w-1; j++){
                    if(a[i][j] % 2 == 1){
                        System.out.println((i + 1) + " " + (j + 1) + " " + (i +1) + " " + (j + 2));
                        a[i][j+1]++;
                    }
                }
                if(i == h-1) break;
                else if(a[i][w-1] % 2 == 1){
                    System.out.println((i + 1) + " " + w + " " + (i + 2) + " " + w);
                    a[i+1][w-1]++;
                }
            }
            else{
                for(int j = w-1; j > 0; j--){
                    if(a[i][j] % 2 == 1){
                        System.out.println((i + 1) + " " + (j + 1) + " " + (i +1) + " " + j);
                        a[i][j+1]++;
                    }
                }
                if(i == h-1) break;
                else if(a[i][0] % 2 == 1){
                    System.out.println((i + 1) + " " + 0 + " " + (i + 2) + " " + 0);
                    a[i+1][0]++;
                }
            }
        }
    }
}


