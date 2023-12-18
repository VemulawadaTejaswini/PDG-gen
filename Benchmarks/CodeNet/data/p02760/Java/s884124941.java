import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        int N = scanner.nextInt();
        Set<Integer> b = new HashSet<>();
        for(int i = 0; i < N; i++) {
            b.add(scanner.nextInt());
        }
        boolean flag = false;
        if(b.contains(A[0][0]) && b.contains(A[0][1]) && b.contains(A[0][2])) {
            flag = true;
        }
        if(b.contains(A[1][0]) && b.contains(A[1][1]) && b.contains(A[1][2])) {
            flag = true;
        }
        if(b.contains(A[2][0]) && b.contains(A[2][1]) && b.contains(A[2][2])) {
            flag = true;
        }

        if(b.contains(A[0][0]) && b.contains(A[1][0]) && b.contains(A[2][0])) {
            flag = true;
        }
        if(b.contains(A[0][1]) && b.contains(A[1][1]) && b.contains(A[2][1])) {
            flag = true;
        }
        if(b.contains(A[0][2]) && b.contains(A[1][2]) && b.contains(A[2][2])) {
            flag = true;
        }

        if(b.contains(A[0][0]) && b.contains(A[1][1]) && b.contains(A[2][2])) {
            flag = true;
        }
        if(b.contains(A[0][2]) && b.contains(A[1][1]) && b.contains(A[2][0])) {
            flag = true;
        }

        if(flag) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
