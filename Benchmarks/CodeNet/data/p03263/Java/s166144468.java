import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] a = new int[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                a[i][j] = sc.nextInt() % 2;
            }
        }
        int[] aa = new int[h * w + w];
        int[] b = new int[h * w + w];
        int[] c = new int[h * w + w];
        int[] d = new int[h * w + w];
        int index = -1;
        for(int i = 0; i < h-1; i++){
            for(int j = 0; j < w; j++){
                if(a[i][j] == 1){
                    for(int k = i; k < h - 1; k++){
                        aa[++index] = k+1;
                        b[index] = j+1;
                        c[index] = k+2;
                        d[index] = j+1;
                    }
                    a[h-1][j]++;
                }
            }
        }
        for(int i = 0; i < w-1; i++){
            if(a[h-1][i] % 2 == 1){
                aa[++index] = h;
                b[index] = i+1;
                c[index] = h;
                d[index] = i+2; 
                a[h-1][i+1]++;
            }
        }
        System.out.println(index + 1);
        for(int i = 0; i <= index; i++){
            System.out.println(aa[i] + " " + b[i] + " " + c[i] + " " + d[i]); 
        }
    }
}