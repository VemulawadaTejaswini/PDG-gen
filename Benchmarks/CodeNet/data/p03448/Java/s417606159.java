import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//500
        int b = sc.nextInt();//100
        int c = sc.nextInt();//50
        
        int x = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i < a; i++) {
            int total = i * 500;
            for (int j = 0; j < b; j++) {
                total += j * 100;
                for (int k = 0; k < c; k++) {
                    total += k * 50;
                    if(total == x){
                        cnt += 1;
                    }
                }
            }
        }


        System.out.println(cnt);

    }

    static boolean foobaa(int[] aaa) {

        for (int i = 0; i < aaa.length; i++) {
            if (aaa[i] % 2 == 0) {
                aaa[i] = aaa[i] / 2;
            } else {
                return false;
            }
        }
        return true;
    }
}
