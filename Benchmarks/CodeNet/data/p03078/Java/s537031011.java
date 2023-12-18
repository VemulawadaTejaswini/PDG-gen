public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int K = sc.nextInt();

        Long[] A = new Long[X];
        Long[] B = new Long[Y];
        Long[] C = new Long[Z];
        Long[] AB = new Long[X*Y];
        int size = Math.min(AB.length, K);
        Long[] ABC = new Long[size * Z];
        for (int i = 0; i < X; i++) {
            A[i] = sc.nextLong();
        }

//        Arrays.sort(A, Collections.reverseOrder());

        for (int i = 0; i < Y; i++) {
            B[i] = sc.nextLong();
        }
//        Arrays.sort(B, Collections.reverseOrder());
        for (int i = 0; i < Z; i++) {
            C[i] = sc.nextLong();
        }

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                AB[Y*i+j] = A[i] + B[j];
            }
        }

        Arrays.sort(AB, Collections.reverseOrder());
        Arrays.sort(C, Collections.reverseOrder());

        int csize = Math.min(Z,K);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < csize; j++) {
                ABC[Z*i+j] = AB[i] + C[j];
            }
        }

        Arrays.sort(ABC, Collections.reverseOrder());

//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(B));
//        System.out.println(Arrays.toString(AB));
//        System.out.println(Arrays.toString(ABC));

        for (int i = 0; i < K; i++) {
            System.out.println(ABC[i]);
        }

    }
}