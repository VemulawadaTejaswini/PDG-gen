import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        int count4 = 0;
        int count2 = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
            if(a[i] % 4 == 0) {
                count4++;
            } else if(a[i] % 2 == 0) {
                count2++;
            } else {
                count++;
            }
        }
        if(count2 > 0) {
            count++;
        }
        if(count4 + 1 >= count) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}