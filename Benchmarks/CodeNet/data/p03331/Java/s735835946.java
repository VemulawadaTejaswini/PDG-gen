import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int out = 0;
        for(int i=1; i<n; i++) {
            int tmpN = i;
            int tmpM = n-i;
            int sumN = 0;
            int sumM = 0;
            while(true) {
                sumN += tmpN % 10;
                if(tmpN / 10 > 0) {
                    tmpN /= 10;
                } else {
                    break;
                }
            }
            while(true) {
                sumM += tmpM % 10;
                if(tmpM / 10 > 0) {
                    tmpM /= 10;
                } else {
                    break;
                }
            }
            if(i == 1) {
                out = sumN + sumM;
            } else if(out > sumN + sumM) {
                out = sumN + sumM;
            }
        }
        System.out.println(out);
    }
}
