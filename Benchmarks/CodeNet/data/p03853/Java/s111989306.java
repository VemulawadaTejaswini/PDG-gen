import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        char[][] c = new char[H][W];
        String[] s = new String[H];
        for(int i = 0; i < H; i++){
            s[i] = sc.next();
            c[i] = s[i].toCharArray();
        }
        sc.close();

        for(int i = 0; i < 2*H; i++){
            for(int j = 0; j < W; j++){
                System.out.print(c[i/2][j]);
            }
            System.out.println();
        }
   }
}