import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isum=0;
        double dsum;
        double ave;
        double s;
        double tmp=0;
        while(true) {
            int num = sc.nextInt();
            if (num == 0) break;
            int[] score = new int[num];
            for (int i = 0; i < num; i++) {
                score[i] = sc.nextInt();
                isum += score[i];
            }
            dsum = (double) isum;
            ave = dsum / (double) num;
            for (int i = 0; i < num; i++) {
                tmp += Math.pow((double)score[i] - ave, 2.0);
            }
            s = Math.sqrt(tmp / num);
            System.out.printf("%.8f\n", s);
        }
    }
}
