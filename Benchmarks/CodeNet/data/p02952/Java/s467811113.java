import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        check(num);
    }

    public static void check(int num) {
        int cnt=0;
        for(int i=1;i<=num;i++) {
            if(String.valueOf(i).length() % 2 == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}