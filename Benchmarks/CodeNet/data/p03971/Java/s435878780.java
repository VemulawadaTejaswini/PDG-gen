import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    int b;
    int capacity;
    int passedCount;
    int lastOverseasRank;

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        b = sc.nextInt();

        capacity = a + b;
        passedCount = 0;
        lastOverseasRank = 0;

        char[] s = sc.next().toCharArray();
        for (char c : s) {
            switch (c) {
            case 'a':
                processForA();
                break;
            case 'b':
                processForB();
                break;
            case 'c':
                processForC();
            }
        }
    }

    void processForA() {
        if (passedCount < capacity) {
            outputYesOrNo(true);
            passedCount++;
        } else {
            outputYesOrNo(false);
        }
    }

    void processForB() {
        lastOverseasRank++;
        if (passedCount < capacity && lastOverseasRank <= b) {
            outputYesOrNo(true);
            passedCount++;
        } else {
            outputYesOrNo(false);
        }
    }

    void processForC() {
        outputYesOrNo(false);
    }

    void outputYesOrNo(boolean isYes) {
        System.out.println(isYes ? "Yes" : "No");
    }
}
