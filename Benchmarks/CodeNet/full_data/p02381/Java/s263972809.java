import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ave;
        double s;
        while(true) {
            double sum=0;
            double tmp=0;
            int num = sc.nextInt();
            if (num == 0) break;
            int[] score = new int[num];
            for (int i = 0; i < num; i++) {
                score[i] = sc.nextInt();
                sum += (double)score[i];
            }
            ave = sum / (double) num;
            for (int i = 0; i < num; i++) {
                tmp += Math.pow((double) score[i] - ave, 2.0);
            }
            s = Math.sqrt(tmp / num);
            System.out.printf("%.8f\n", s);
        }
    }
}

