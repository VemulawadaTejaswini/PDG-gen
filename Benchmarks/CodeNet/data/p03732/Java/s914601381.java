import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Integer> stones[];
    static long W;
    static long N;
    static long F;
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        W = scanner.nextInt();
        stones = new ArrayList[4];
        for (int i = 0;i < 4;++i){
            stones[i] = new ArrayList<>();
        }
        for (int i = 0;i < N;++i){
            int w = scanner.nextInt();
            int v = scanner.nextInt();
            if(i == 0){
                F = w;
            }
            stones[(int)(w - F)].add(v);
        }
        for (int i = 0;i < 4;++i){
            stones[i].sort((a,b) -> b - a);
        }
        System.out.println(search());
    }

    public static long search(){
        long r = 0;
        for (long i1 = -1;i1 < stones[0].size();++i1){
            for (long i2 = -1;i2 < stones[1].size();++i2) {
                for (long i3 = -1; i3 < stones[2].size(); ++i3) {
                    for (long i4 = -1; i4 < stones[3].size(); ++i4) {
                        if((i1 + 1) * F + (i2 + 1) * (F + 1) + (i3 + 1) * (F + 2) + (i4 + 1) * (F + 3) > W)continue;
                        long t = 0;
                        if(i1 >= 0)for (int i = 0; i <= i1; ++i) {
                            t += stones[0].get(i);
                        }
                        if(i2 >= 0)for (int i = 0; i <= i2; ++i) {
                            t += stones[1].get(i);
                        }
                        if(i3 >= 0)for (int i = 0; i <= i3; ++i) {
                            t += stones[2].get(i);
                        }
                        if(i4 >= 0)for (int i = 0; i <= i4; ++i) {
                            t += stones[3].get(i);
                        }
                        if(r < t)r = t;
                    }
                }
            }
        }
        return r;
    }

}


