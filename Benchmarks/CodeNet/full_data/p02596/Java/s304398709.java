import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long count = 1l;
        long ans = -1l;
        if(k % 2 == 0) {
            System.out.println(-1);
            return;
        }
        while(true) {
            long tmp = k * count;
            String s = Long.toString(tmp);
            if(s.matches("^7+")) {
                ans = s.length();
                break;
            }
            count++;
        }
        System.out.println(ans);
    }
}