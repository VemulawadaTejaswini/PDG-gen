import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    int b;
    int capacity;
    int lastRank;
    int lastOverseasRank;

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        b = sc.nextInt();

        capacity = a + b;
        lastRank = 0;
        lastOverseasRank = 0;

        char[] s = sc.next().toCharArray();
        for (char c : s) {
            switch (c) {
            case 'a':
                processForA();
            case 'b':
                processForB();
            case 'c':
                processForC();
            }
        }
    }

    void processForA() {
        lastRank++;
        outputYesOrNo(lastRank <= capacity);
    }

    void processForB() {
        lastRank++;
        lastOverseasRank++;
        outputYesOrNo(lastRank <= capacity && lastOverseasRank <= b);
    }

    void processForC() {
        outputYesOrNo(false);
    }

    void outputYesOrNo(boolean isYes) {
        System.out.println(isYes ? "Yes" : "No");
    }
}
