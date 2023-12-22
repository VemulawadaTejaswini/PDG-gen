import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Double[] list = Arrays.stream(sc.nextLine().split(",")).map(Double::parseDouble).toArray(Double[]::new);
            double sum = Arrays.stream(list).mapToDouble(x -> x).sum() - list[10] - list[11];
            double[] l = new double[11];
            l[0] = 0;
            for (int i = 1; i < 11; i++) {
                l[i] = l[i - 1] + list[i - 1];
            }
            for (int i = 0; i < l.length; i++) {
                if (l[i] >= list[10] * sum / (list[10] + list[11])) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
