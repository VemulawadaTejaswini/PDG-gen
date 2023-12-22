
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long x = sc.nextLong();
    //65まで持っていればいい
    //65の5乗が10の9乗を超えとこ
    static long num[] = new long[123];

    public static void main(String[] args) {
        int i = -1;
        while (++i < num.length){
            if (i == 0) {
                num[0] = 0;
                continue;
            }
            num[i] = (int)Math.pow(i, 5);
            System.out.println(num[i]);
        }
        for (int j = 0; j < num.length; j++){
            for (int k = 0; k < num.length; k++){
                if (num[j] - num[k] == x){
                    System.out.println(j + " " + k);
                    return;
                } else if ( - num[j] - num[k] == x){
                    System.out.println(-j + " " + k);
                    return;
                } else if ( num[j] + num[k] == x){
                    System.out.println(j + " " +  -k);
                    return;
                }
            }
        }
    }
}
