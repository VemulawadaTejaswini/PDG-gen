
import java.util.ArrayList;
import java.util.Scanner;

// ABC091 at 2018/03/17

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveB();
    }

    private void solveA() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if ((A + B) < C) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    private void solveB() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list1.add(sc.nextLine());
        }
        int M = sc.nextInt();
        ArrayList<String> list2 = new ArrayList<>();
        sc.nextLine();
        for (int j = 0; j < M; j++) {
            list2.add(sc.nextLine());
        }

        int cnt = 0;
        int max = 0;
        ArrayList<String> used = new ArrayList<>();
        for (String string : list1) {
            if (!used.contains(string)) {
                cnt = cul(string, list1, list2);
                if (max < cnt) {
                    max = cnt;
                }
                used.add(string);
            }
        }
        if (max < 0) {
            System.out.println(0);
        } else {
            System.out.println(max);
        }

    }
    private int cul(String target, ArrayList<String> list1, ArrayList<String> list2) {
        int cnt = 0;
        for (String string : list1) {
            if (target.equals(string)) {
                cnt++;
            }
        }
        for (String string : list2) {
            if (target.equals(string)) {
                cnt--;
            }
        }
        return cnt;
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