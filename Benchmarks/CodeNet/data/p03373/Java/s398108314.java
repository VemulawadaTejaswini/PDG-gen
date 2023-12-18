
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final long a = sc.nextLong();
        final long b = sc.nextLong();
        final long c = sc.nextLong();
        long x = sc.nextInt();
        long y = sc.nextInt();

        if((a+b) <= c * 2) {
            System.out.println(a * x + b * y);
            return;
        }

        long numReplace = (Math.min(x,y) / 2) * 2;
        long x1 = x - numReplace;
        long y1 = y - numReplace;
        long half1  = numReplace;
        long sum1 = a * x1 + b * y1 + c * half1;

        long numReplace2 = (Math.max(x,y) / 2) * 2;
        long x2 = x - numReplace2;
        long y2 = y - numReplace2;
        long half2  = numReplace2;
        long sum2 = a * x2 + b * y2 + c * half2;

        long numReplace3 = (Math.max(x,y) / 2) * 2 + 2;
        long x3 = x - numReplace2;
        long y3 = y - numReplace2;
        long half3  = numReplace2;
        long sum3 = a * x3 + b * y3 + c * half3;

        long answer = LongStream.of(sum1, sum2, sum3).min().getAsLong();
        System.out.println(answer);
    }

}
