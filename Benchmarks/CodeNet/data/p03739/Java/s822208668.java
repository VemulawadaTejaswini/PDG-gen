import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum1 = 0;
        long ans1 = 0;
        long sum2 = 0;
        long ans2 = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sum1 += a;
            sum2 += a;
            if(i % 2 == 0){
                if(sum1 >= 0){
                    ans1 += sum1 + 1;
                    sum1 = -1;
                }
                if(sum2 <= 0){
                    ans2 += Math.abs(sum2) + 1;
                    sum2 = 1;
                }
            }else{
                if(sum1 <= 0){
                    ans1 += Math.abs(sum1) + 1;
                    sum1 = 1;
                }
                if(sum2 >= 0){
                    ans2 += sum2 + 1;
                    sum2 = -1;
                }
            }
        }

        System.out.println(Math.min(ans1, ans2));
        sc.close();
    }

}
