
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long start = in.nextLong();
        long nSteps = in.nextLong();
        long hop = in.nextLong();
        while(nSteps-->0) {
            start = (start > 0) ? (start - hop) : (start + hop);
        }
        System.out.println(Math.abs(start));
    }
}
