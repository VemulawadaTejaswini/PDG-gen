
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        IntStream.range(0,N).forEach(i -> a[i] =  rateToColor(sc.nextInt()) );

        int color_unknown = (int)Arrays.stream(a).filter(i -> i == 9).count();
        int colors = (int)Arrays.stream(a).filter(i -> i != 9).distinct().count();

        if(color_unknown == 0){
            System.out.print(colors);
            System.out.print(" ");
            System.out.print(colors);
            return;
        }

        int max;
        //max
        if(colors + color_unknown >= 9){
            max = 9;
        }else {
            max = colors + color_unknown;
        }

        int min = Math.max(color_unknown,colors);
        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
    }

    private static int rateToColor(int rate){
//        レート 1-399：灰色 1
//        レート 400-799：茶色 2
//        レート 800-1199：緑色 3
//        レート 1200-1599：水色 4
//        レート 1600-1999：青色 5
//        レート 2000-2399：黄色 6
//        レート 2400-2799：橙色 7
//        レート 2800-3199：赤色 8
           //9
        if(rate >= 3200){ return 9; }
        if(rate >= 2800){ return 8; }
        if(rate >= 2400){ return 7; }
        if(rate >= 2000){ return 6; }
        if(rate >= 1600){ return 5; }
        if(rate >= 1200){ return 4; }
        if(rate >= 800 ){ return 3; }
        if(rate >= 400 ){ return 2; }
        return 1;
    }
}