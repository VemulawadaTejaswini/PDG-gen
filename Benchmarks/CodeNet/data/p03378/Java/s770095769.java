import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            int N = Integer.parseInt(array[0]);
            int M = Integer.parseInt(array[1]);
            int X = Integer.parseInt(array[2]);

            String[] Ms = scanner.nextLine().split(" ");
            int count = 0;
            while (count < M) {
                if (Integer.parseInt(Ms[count]) < X) {
                    ++count;
                } else {
                    break;
                }
            }
            if (count > M - count) {
                count = M - count;
            }
            System.out.println(count);
        }
    }
}