//B.java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        int max = 0;
        for(int i=0; i<3; i++) {
            num[i] = sc.nextInt();
            if(max < num[i]) max = num[i];
        }
        int k = sc.nextInt();

        sc.close();
        double ans = Math.pow(2, k)*max + num[0] + num[1] + num[2] - max;
        System.out.println((int)ans);
    }
}