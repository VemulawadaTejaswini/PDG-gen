import java.util.*;

class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            long A = scanner.nextLong();
            long B = scanner.nextLong();
            long C = scanner.nextLong();
            long D = scanner.nextLong();
            System.out.println(solve(A, B, C, D) ? "Yes" : "No");
        }
    }

    static boolean solve(long A, long B, long C, long D) {
        long zaiko = A;
        Set<Long> visited = new HashSet<>();
        visited.add(zaiko);
        while (zaiko >= B) {
            zaiko -= B;
            if (zaiko > C) {
                long x = (zaiko - C) / B;
                if ((zaiko - C) % B > 0) x++;
                zaiko -= x * B;
                if (zaiko < 0 || zaiko > C) return false;
            }
            zaiko += D;
            if (visited.contains(zaiko)) return true;
            visited.add(zaiko);
        }
        return false;
    }
}
