import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Long> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextLong());
        }
        List<Integer> B = new ArrayList<>();
        List<Long> C = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            B.add(scanner.nextInt());
            C.add(scanner.nextLong());
        }
        scanner.close();

        // A sort
        Collections.sort(A);

        // B count
        long bCount = 0;

        // B C
        List<Long> BC = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int b = B.get(i);
            long c = C.get(i);
            for (int j = 0; j < b; j++) {
                BC.add(c);
                bCount++;
                if (BC.size() == N) {
                    break;
                }
            }
            if (BC.size() == N) {
                break;
            }
        }
        Collections.sort(BC);
        Collections.reverse(BC);

        System.out.println(BC);

        for (int i = 0; i < bCount; i++) {
            long a = A.get(i);
            long bc = BC.get(i);
            if (a < bc) {
                A.set(i, bc);
//                System.out.println(A);
            } else {
                break;
            }
        }

        long sum = 0;
        for (long l : A) {
            sum += l;
        }

        System.out.println(sum);

//        System.out.println(System.currentTimeMillis() - startTime);
    }


}
