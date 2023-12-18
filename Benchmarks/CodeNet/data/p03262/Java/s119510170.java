import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int citiesN = scanner.nextInt();
        int startX = scanner.nextInt();
        int[] cityCoordinatex = new int[citiesN+1];
        int[] distance = new int[citiesN];

        for(int i=0;i<citiesN;i++){
            cityCoordinatex[i]= scanner.nextInt();
        }
        cityCoordinatex[citiesN] = startX;
        Arrays.sort(cityCoordinatex); //配列を読み込んでソートする

        for(int i=1;i<citiesN+1;i++) {
            distance[i-1] = cityCoordinatex[i]-cityCoordinatex[i-1];
        } //距離の算出

//        //debug
//        for(int i=0;i<citiesN+1;i++) {
//            System.out.print(cityCoordinatex[i]+" ");
//        }
//        System.out.println();
//        for(int i=0;i<citiesN;i++) {
//            System.out.print(distance[i]+" ");
//        }
//        System.out.println();

        int g;
        if(citiesN!=1) {
            g = gcds(distance);
        }else{
            g = distance[0];
        }
        System.out.println(g);
    }

    public static int gcds(final int... param) {
        final int len = param.length;
        int g = gcd(param[0], param[1]);
        if(len!=2) {
            for (int i = 1; i < len - 1; i++) {
                g = gcd(g, param[i + 1]);
            }
        }
        return g;
    }

    public static int gcd(int a, int b) {
        //a > b にする（スワップ）
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        //ユークリッドの互除法
        int r = -1;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;    //b には r=0 の値が入るため、a を返す
    }

}
