import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        D2[] red = new D2[n];
        D2[] blue = new D2[n];
        for (int i = 0;i < n;++i){
            red[i] = new D2(sc.nextInt(),sc.nextInt());
        }
        for (int i = 0;i < n;++i){
            blue[i] = new D2(sc.nextInt(),sc.nextInt());
        }
        int j = search(red,blue);
        System.out.println(j);
    }

    public static int search(D2[] red,D2[] blue){
        int max = -1;
        for (int i = 0;i < red.length;++i){
            for (int j = 0;j < blue.length;++j){
                if(red[i] == null||blue[j] == null)continue;
                if(red[i].x < blue[j].x&&red[i].y < blue[j].y){
                    D2[] rered = red.clone();
                    D2[] reblue = blue.clone();
                    rered[i] = null;reblue[j] = null;
                    int k = search(rered,reblue);
                    if(k > max)max = k;
                }
            }
        }
        return max + 1;
    }

    static class D2{
        public int x,y;
        public D2(int x,int y){
            this.x = x;this.y = y;
        }
    }

}