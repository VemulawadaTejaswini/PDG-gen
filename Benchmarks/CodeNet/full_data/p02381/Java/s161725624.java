import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isum=0;
        double dsum;
        double ave;
        double s;
        double tmp=0;
        int num = sc.nextInt();
        int[] score=new int[30];
        for (int i = 0; i < num; i++) {
            score[i]=sc.nextInt();
            isum+=score[i];
        }
        dsum=isum;
        ave=dsum/num;
        for(int i=0;i<num;i++){
            tmp+=Math.pow(score[i]-ave,2.0);
        }
        s=Math.sqrt(tmp/num);
        System.out.println(s);
    }
}
