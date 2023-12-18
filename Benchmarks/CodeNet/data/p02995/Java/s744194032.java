import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int count = 0;
        for (long i = 0; i < B - A + 1; i++) {
            if ((A+i)%C != 0 && (A+i)% D != 0) {
                for (long j = A+i; j < B; j += C*D) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}