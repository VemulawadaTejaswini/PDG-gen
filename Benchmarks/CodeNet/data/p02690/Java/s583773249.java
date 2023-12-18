
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int x = sc.nextInt();
    //65まで持っていればいい
    //65の5乗が10の9乗を超えとこ
    static int num[] = new int[64];

    public static void main(String[] args) {
        int i = -1;
        while (i++ < num.length){
            num[i] = (int)Math.pow(i + 1, 5);
        }
        for (int j = 0; j < num.length; j++){
            for (int k = 0; k < num.length; k++){
                if (num[j] + num[k] == x){
                    System.out.println(num[j] + num[k]);
                } else if ( - num[j] + num[k] == x){
                    System.out.println(num[j] + num[k]);
                } else if ( num[j] - num[k] == x){
                    System.out.println(num[j] + num[k]);
                }
            }
        }
    }
}
