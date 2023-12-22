import java.util.Scanner;
class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            int A = scanner.nextInt();

            int B = scanner.nextInt();

            int max = getMAX(A, B);

            int min = getMIN(A, B, max);

            System.out.println(max + " " + min);



        }
    }

    private static int getMAX(int A, int B) {
        for (int i = A; A > 0; i--) {
            if (A % i == 0 && B % i == 0) {
                return i;
            }
        }
        return 1;
    }
    private static int getMIN(int A, int B, int max){
        return A/max*B;
    }
}
