import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long num1[] = new long[5];
        for (int i = 0; i < 5; i++) {
            num1[i] = sc.nextInt();
        }

        long num2[] = new long[6];
        num2[0] = n;
        long count = 0;

        while (num2[5] < n) {
            for (int i = 4; i >= 0; i--) {
                if (num2[i] != 0) {
                    long num3 = num2[i] - num1[i];
                    if (num3 > 0) {
                        num2[i] = num3;
                        num2[i+1] += num1[i];
                    } else {
                        num2[i+1] += num2[i];
                        num2[i] = 0;
                    }
                }
            }
            count++;
        }

        System.out.println(count);
	}
}
