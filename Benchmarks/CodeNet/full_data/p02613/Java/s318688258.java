import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] outputCnt = new int[4];
        for (int i = 0; i < N; i++) {
            String testCase = sc.next();
            if (testCase.equals("AC")) {
                outputCnt[0]++;
            }
            if (testCase.equals("WA")) {
                outputCnt[1]++;
            }
            if (testCase.equals("TLE")) {
                outputCnt[2]++;
            }
            if (testCase.equals("RE")) {
                outputCnt[3]++;
            }
        }
        System.out.println("AC × " + outputCnt[0]);
        System.out.println("WA × " + outputCnt[1]);
        System.out.println("TLE × " + outputCnt[2]);
        System.out.println("RE × " + outputCnt[3]);
    }
}