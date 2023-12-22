import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            execute(sc);
        }
    }

    static void execute(Scanner sc) {
        int n = sc.nextInt();sc.nextLine();
        if (n == 0) { return; }
        int[][] rs = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            int[] line = convertInt(sc.nextLine().split(" "));
            for (int j = 0; j < n; j++) {
                rs[i][j] = line[j];
            }
            rs[i][n] = sum(line);
        }
        for (int i = 0; i < n + 1; i++) {
            int sumVertical = 0;
            for (int j = 0; j < n; j++) {
                sumVertical += rs[j][i];
            }
            rs[n][i] = sumVertical;
        }
        for (int[] A : rs) {
            for (int i : A) {
                System.out.print(String.format("%5s", String.valueOf(i)));
            }
            System.out.println("");
        }
    }

    static int[] convertInt(String[] args) {
        int[] intA = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            intA[i] = Integer.parseInt(args[i]);
        }
        return intA;
    }

    static int sum(int[] A) {
        int rs = 0;
        for (int i = 0; i < A.length; i++) {
            rs += A[i];
        }
        return rs;
    }
}

