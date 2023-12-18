import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int wantUpper = 55555;
        int furui[] = new int[wantUpper + 1];

        for (int i = 2; i <= wantUpper; i++) {
            furui[i] = i;//篩に2~nまでの値を入れる
        }
        for (int i = 2; i <= Math.sqrt(wantUpper); i++) {
            for (int j = i + i; j <= wantUpper; j += i) {//iの倍数は篩落とす
                furui[j] = 0;
            }
        }
        int count = 0;
        for(int i = 2; i <= 55555 && count < n; i++) {
            if(furui[i]==i && i % 10 == 1) {
                System.out.print(i+" ");
                count++;
            }
        }
    }
}
