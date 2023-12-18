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
        for( int i = 0 ; i < n ; i ++ ){
            String[] ps = in.nextLine().split(" ");
            ss[i] = Integer.parseInt(ps[0]);
            ts[i] = Integer.parseInt(ps[1]);
            xs[i] = Integer.parseInt(ps[2]);
        }
        int[] ds = new int[q];
        for( int i = 0 ; i < q ; i ++ ){
            String[] ps = in.nextLine().split(" ");
            ds[i] = Integer.parseInt(ps[0]);
        }

        int max = 0;
        for( int i = 0 ; i < xs.length ; i++ ){
            if( max < xs[i] ){
                max = xs[i];
            }
        }
        max += 1;

        int timerMaxCount = 0;
        for( int i = 0 ; i < ds.length ; i++ ){
            if( timerMaxCount < ds[i] ) {
                timerMaxCount = ds[i];
            }
        }
        timerMaxCount += max;

        max = 0;
        for( int i = 0 ; i < ts.length ; i++ ){
            if( max < ts[i]){
                max = ts[i];
            }
        }
        timerMaxCount += max;

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