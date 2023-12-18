import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() * 100, b = sc.nextInt() * 100, c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt();
        int suger = 0;
        int water = a;
        for(int i = 0; a * i <= f; i++)
            for(int j = 0; b * j <= f - a * i; j++){
                int max = (a * i + b * j) / 100 * e;
                for(int k = 0; c * k <= max; k++)
                    for(int l = 0; d * l <= max - c * k; l++){
                        int tmpw = a * i + b * j + c * k + d * l;
                        int tmps = c * k + d * l;
                        if(tmpw > 0 && tmpw <= f && (double)suger / (double) water < (double)tmps /(double) tmpw){
                            suger = tmps;
                            water = tmpw;
                        }
                    }
            }
        System.out.println(water + " " + suger);
    }
}