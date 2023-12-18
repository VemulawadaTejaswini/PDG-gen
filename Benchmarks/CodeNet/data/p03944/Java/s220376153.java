import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[] xx = new int[w];
        int[] yy = new int[h];
        Arrays.fill(xx, 1);
        Arrays.fill(yy, 1);

        int x = 0;
        int y = 0;
        for(int i = 0;i<n;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            int a = sc.nextInt();
            sc.nextLine();
            if(a == 1){
                for(int j = x-1;j>=0;j--){
                    xx[j] = 0;
                }
            }else if(a == 2){
                for(int j = x;j<w;j++){
                    xx[j] = 0;
                }
            }else if(a == 3){
                for(int j = y-1;j>=0;j--){
                    yy[j] = 0;
                }
            }else if(a == 4){
                for(int j = y;j<h;j++){
                    yy[j] = 0;
                }
            }
        }
        x = 0;
        y = 0;

        for(int i = 0;i<w;i++){
            x += xx[i];
        }
        for(int i = 0;i<h;i++){
            y += yy[i];
        }
        System.out.println(x*y);
    }
}