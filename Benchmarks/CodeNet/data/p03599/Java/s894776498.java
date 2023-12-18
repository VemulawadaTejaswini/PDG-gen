import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int suger = 0;
        int water = 0;
        int a = sc.nextInt() * 100, b = sc.nextInt() * 100, c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt();
        for(int i = 0; a * i <= f; i++){
            for(int j = 0; b * j <= f - a * i; j++){
                int max = (a * i + b * j) / 100 * e;
                for(int k = 0; c * k <= max; k++){
                    for(int l = 0; d * l <= max - c * k; l++){
                        if(suger < c * k + d * l && a * i + b * j + c * k + d * l <= f){
                            suger = c * k + d * l;
                            water = a * i + b * j + suger;
                        }
                    }
                }
            }
        }
        System.out.println(water + " " + suger);
    }
}