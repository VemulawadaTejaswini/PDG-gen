import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] firstParams = in.nextLine().split(" ");
        int n = Integer.parseInt(firstParams[0]);
        int q = Integer.parseInt(firstParams[1]);

        int[] ss = new int[n];
        int[] ts = new int[n];
        int[] xs = new int[n];
        int tsMax = 0;
        int xsMax = 0;
        for( int i = 0 ; i < n ; i ++ ){
            String[] ps = in.nextLine().split(" ");
            ss[i] = Integer.parseInt(ps[0]);
            ts[i] = Integer.parseInt(ps[1]);
            xs[i] = Integer.parseInt(ps[2]);
            if( tsMax < ts[i])tsMax = ts[i];
            if( xsMax < xs[i])xsMax = xs[i];
        }
        int[] ds = new int[q];
        int dsMax = 0;
        for( int i = 0 ; i < q ; i ++ ){
            String[] ps = in.nextLine().split(" ");
            ds[i] = Integer.parseInt(ps[0]);
            if( dsMax < ds[i])dsMax = ds[i];
        }

        int timerMaxCount = tsMax + dsMax + xsMax;

        for(int i = 0 ; i < ds.length ; i++ ){
            boolean inf = true;
            for( int time = ds[i] , pos = 0 ; time < timerMaxCount ; time++ , pos++){
                for( int j = 0 ; j < n ; j++ ){
                    if( ss[j] <= time && time < ts[j]){
                        if( pos == xs[j] ){
                            System.out.println(pos);
                            inf = false;
                            time = timerMaxCount;
                        }
                    }
                }
            }
            if( inf ){
                System.out.println(-1) ;
            }
        }
    }
}