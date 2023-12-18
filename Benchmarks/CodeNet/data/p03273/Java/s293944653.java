import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] a = new char[H][W];
        for(int i = 0; i < H; i++){
            String s = sc.next();
            for(int j = 0; j < W; j++){
                a[i][j] = s.charAt(j);
            }
        }
        sc.close();
        int[] h = new int[H];
        int[] w = new int[W];
        for(int i = 0; i < H; i++){
            if(full_row(a[i]))
                h[i] = 1;
        }
        for(int i = 0; i < W; i++){
            if(full_col(a, i))
                w[i] = 1;
        }

        for(int i = 0; i < H; i++){
            if(h[i] == 0){
                for(int j = 0; j < W; j++){
                    if(w[j] == 0)
                        System.out.print(a[i][j]);
                }
                System.out.println();
            } 
        }
    }
    static boolean full_row(char[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i] == '#')
                return false;
        }
        return true;
    }

    static boolean full_col(char[][] a, int n){
        for(int i = 0; i < a.length; i++){
            if(a[i][n] == '#')
                return false;
        }
        return true;
    }
}