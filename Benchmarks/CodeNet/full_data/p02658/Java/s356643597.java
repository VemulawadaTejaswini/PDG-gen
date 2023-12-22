import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        long ans = 1l;
        long std = 1000000000000000000l;
        boolean isBreak = false;
        for (int i1 = 0; i1 < i; i1++) {
            long mul = scanner.nextLong();
            if(mul > (std / ans)){
                System.out.println(-1);
                isBreak = true;
            }else{
                ans *= mul;
            }
        }
        if(!isBreak)
            System.out.println(ans);
    }
}
