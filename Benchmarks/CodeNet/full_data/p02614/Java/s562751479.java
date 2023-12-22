
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt(), k = sc.nextInt();
        boolean[][] b = new boolean[h][w];
        for(int i=0;i<h;i++){
            char[] c = sc.next().toCharArray();
            for(int j=0;j<w;j++){
                b[i][j] = c[j] == '#';
            }
        }
        int i_max = (int) Math.pow(2, h);
        int j_max = (int) Math.pow(2, w);
        int count = 0;
        int ans = 0;
        for(int i=0;i<i_max;i++){
            for(int j=0;j<j_max;j++){
                count = 0;
                for(int x=0;x<h;x++){
                    for(int y=0;y<w;y++){
                        int x_ = (int) Math.pow(2, x);
                        int y_ = (int) Math.pow(2, y);
                        if(b[x][y] && ((i & x_) == 0) && ((j & y_) == 0)){
                            count++;
                        }
                    }
                }
                if(count == k){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
