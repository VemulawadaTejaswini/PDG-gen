import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        int N = sc.nextInt(), Q = sc.nextInt();
                        String[] SS = new String[N];
                        int[] NN = new int[N];
                        for (int i = 0; i < N; i++) {
                                SS[i] = sc.next();
                                NN[i] = sc.nextInt();
                        }
                        int count = 0;
                        int sum = 0;
                        while (count < N) {
                                for (int i = 0; i < N; i++) {
                                        if (NN[i] > 0) {
                                                NN[i] -= Q;
                                                sum += Q;
                                                if (NN[i] <= 0) {
                                                        sum +=NN[i];
                                                        System.out.println(SS[i] + " " + sum);
                                                        count++;
                                                }
                                        }
                                }
                        }
                }
        }
}