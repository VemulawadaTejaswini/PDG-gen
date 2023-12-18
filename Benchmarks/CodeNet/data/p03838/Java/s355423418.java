import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int res = Math.abs(Math.abs(x) - Math.abs(y));
        if(Math.abs(x) < Math.abs(y)) {
            if(x < 0 && y < 0) res += 2;
            else if(!(x >= 0 && y >= 0)) res += 1;
        }
        if(Math.abs(x) > Math.abs(y)) {
            if(x >= 0 && y >= 0) res += 2;
            else if(!(x < 0 && y < 0)) res += 1;
        }
        if(Math.abs(x) == Math.abs(y) && (x < 0 && y > 0 || x > 0 && y < 0)) res += 1;
        System.out.println(res);
    }
}
