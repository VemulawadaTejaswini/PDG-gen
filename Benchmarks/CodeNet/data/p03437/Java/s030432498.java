import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();

        if(y == x || y == 1 || x % y == 0){
            System.out.println(-1);
        }else{
            if(x < 999999990){
                System.out.println(x*1000000007);
            }else{
                System.out.println(x*999999937);
            }
        }
    }
}