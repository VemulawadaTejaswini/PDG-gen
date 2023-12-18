import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int L = scanner.nextInt();

        int minZeroDiff = Integer.MAX_VALUE;

        int allSum = 0;

        for(int i=1; i<=N; i++){

            int taste = L + i - 1;

            if(Math.abs(taste) < Math.abs(minZeroDiff)){
                minZeroDiff = taste;
            }

            allSum += taste;
        }

        int trueTaste = allSum - minZeroDiff;

        System.out.println(trueTaste);
    }
}
