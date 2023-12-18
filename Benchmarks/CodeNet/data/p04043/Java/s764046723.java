
import java.util.Scanner;

// *** at 2018/**/**

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveA();
    }

    private void solveA() {
        Scanner sc = new Scanner(System.in);
        char nums[] = sc.nextLine().toCharArray();

        int five = 0;
        int seven = 0;

        for (char c : nums) {
            if (Character.getNumericValue(c) == 5) {
                five++;
            } else if (Character.getNumericValue(c) == 7) {
                seven++;
            }
        }
        if (five == 2 && seven == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private void solveB() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveC() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveD() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveE() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveF() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

}