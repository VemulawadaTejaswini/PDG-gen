import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        int[][] l = new int[H+1][W+1];
        int odd = 0;
        for(int i = 1;i <= H;i++){
            for(int j = 1;j <= W;j++){
                l[i][j] = sc.nextInt();
                if(l[i][j]%2 == 1) odd++;
            }
        }
        int c = 0;
        int i = 1;
        System.out.println(odd/2);
        loop: while(i <= H){
            for(int j = 1;j <= W;j++){
                if(l[i][j]%2 == 1){
                    if(c == 0 && odd >= 2){
                        System.out.print(i+" "+j+" ");
                        c = 1;
                    }else if(c == 1){
                        System.out.println(i+" "+j);
                        c = 0;
                    }
                    odd--;
                    if(odd == 0)    break loop;
                }
            }
            i++;
            if(i > H)   break loop;
            for(int j = W;j >= 1;j--){
                if(l[i][j]%2 == 1){
                    if(c == 0 && odd >= 2){
                        System.out.print(i+" "+j+" ");
                        c = 1;
                    }else if(c == 1){
                        System.out.println(i+" "+j);
                        c = 0;
                    }
                    odd--;
                    if(odd == 0)    break loop;
                }
            }
            i++;
        }
    }
}