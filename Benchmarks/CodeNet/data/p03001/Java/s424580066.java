import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] params = in.nextLine().split(" ");
        int w = Integer.parseInt(params[0]);
        int h = Integer.parseInt(params[1]);
        int x = Integer.parseInt(params[2]);
        int y = Integer.parseInt(params[3]);


        // 直線上にある場合　面積の半分＋0
        if( x == 0 || y == 0 || x == w || y == h ){
            System.out.println( ( String.format("%.9f", (double)w * h / 2 )) + " 0" );
            return;
        }

        // 図の中心にある場合　面積の半分+1
        if( (double)w / 2 == (double)x && (double)h / 2 == (double)y ){
            System.out.println( ( String.format("%.9f", (double)w * h / 2 )) + " 1");
            return;
        }

        // 対角線上にある場合　面積の半分＋0
        if( (double)h / w == (double)y / x ){
            System.out.println( ( String.format("%.9f", (double)w * h / 2 )) + " 0");
            return;
        }
        if( (double)h/w == (double)(y-h) / -x ){
            System.out.println( ( String.format("%.9f", (double)w * h / 2 )) + " 0");
            return;
        }

        // h/2==yの場合　面積の半分＋1
        if( (double)h/2 == (double)y){
            System.out.println( ( String.format("%.9f", (double)w * h / 2 )) + " 1");
            return;
        }

        // w/2==xの場合　面積の半分+1
        if( (double)w/2 == (double)x){
            System.out.println( ( String.format("%.9f", (double)w * h / 2 )) + " 1");
            return;
        }

        // 上記以外は面積の半分+0
        System.out.println( ( String.format("%.9f", (double)w * h / 2 )) + " 0");
        return;

    }
}