import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        long H = Integer.parseInt(values[0]);
        long N = Integer.parseInt(values[1]);
        TreeMap<Double,Long[]> magics = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            line = scanner.nextLine();
            while (line.equals("")) {
                line = scanner.nextLine();
            }
            values = line.split(" ");
            long A = Long.parseLong(values[0]);
            long B = Long.parseLong(values[1]);
            double per = B / (double)A;
            if (magics.containsKey(per)) {
                long tempA = magics.get(per)[0];
                if (tempA > A) {
                    magics.replace(per,new Long[]{A,B});
                }
            }
            magics.put(per,new Long[]{A,B});
        }
        long health = H;
        long mp = 0;
        long bestA = -1;
        long bestB = -1;
        for (Double aFloat : magics.keySet()) {
            Long[] first = magics.get(aFloat);
            long A = first[0];
            long B = first[1];
            long atks = health / A;
            if (atks == 0) {
                for (Long[] value : magics.values()) {
                    long A2 = value[0];
                    long B2 = value[1];
                    if (bestA == -1) {
                        bestA = A2;
                        bestB = B2;
                        continue;
                    }
                    if (A2 >= health) {
                        if (B2 <= bestB) {
                            bestB = B2;
                            bestA = A2;
                        }
                    }
                }
                mp += bestB;
                break;
            }
            mp += B * atks;
            health -= A * atks;
            if (health <= 0) {
                break;
            }
        }
        System.out.println(mp);
    }
}