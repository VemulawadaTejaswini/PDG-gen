import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        long ans = 1L;
        for (int i = 0; i < time; i++) {
            long mul = sc.nextLong();
            if(Math.log10(mul)+Math.log10(ans) > 18 || mul * ans > 1000000000000000000L){
                ans = -1;
            }else if(mul == 0){
                ans *=0;
            }else if(mul != -1){
                ans *= mul;
            }
        }
        System.out.println(ans);
    }
}