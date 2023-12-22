import java.util.Scanner;

// 東京海上日動プログラミングコンテスト2020
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long v = in.nextLong();
        long b = in.nextLong();
        long w = in.nextLong();
        long t = in.nextLong();
        
        long diff = Math.abs(a-b);
        boolean reachable = (v*t)-diff>=(w*t) || diff==0;
        System.out.println(reachable ? "YES" : "NO");
    }
}
