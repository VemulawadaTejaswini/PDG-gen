import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];
        int[] a = new int[6];
         for (int i=0; i<6; i++) {
            num[i] = sc.nextInt();
            a[i] = num[i];
        }
        String str = sc.next();
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)=='E') {
                num[0] = a[3];
                num[2] = a[0];
                num[5] = a[2];
                num[3] = a[5];
                a = num.clone();
            } else if (str.charAt(i)=='N') {
                num[0] = a[1];
                num[4] = a[0];
                num[5] = a[4];
                num[1] = a[5];
                a = num.clone();
            } else if (str.charAt(i)=='S') {
                num[0] = a[4];
                num[1] = a[0];
                num[5] = a[1];
                num[4] = a[5];
                a = num.clone();
            } else {
                num[0] = a[2];
                num[3] = a[0];
                num[5] = a[3];
                num[2] = a[5];
                a = num.clone();
            }
        }
        System.out.println(num[0]);
    }
}

