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
        List<Long> B = new ArrayList<>();
        List<Long> C = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            B.add(scanner.nextLong());
            C.add(scanner.nextLong());
        }
        scanner.close();

        // A sort
        Collections.sort(A);


        for (int i = 0; i < M; i++) {
            long Bi = B.get(i);
            long Ci = C.get(i);
            for (int j = 0; j < N; j++) {
                long Aj = A.get(j);
                if (Aj < Ci) {
//                    System.out.println("Aj::"+Aj);
//                    System.out.println("Ci::"+Ci);
//                    System.out.println("A::"+A);
                    A.set(j, Ci);
                    Bi--;
                }
                if (Bi <= 0) {
                    break;
                }
            }
            Collections.sort(A);
        }

        long sum = 0;
        for (long l : A) {
            sum += l;
        }

        System.out.println(sum);

//        System.out.println(System.currentTimeMillis() - startTime);
    }


}
