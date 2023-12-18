import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] city = new int[num + 1];
        int[] brave = new int[num];
        for (int i = 0; i <= num; i++) {
            city[i] = Integer.parseInt(in.next());
        }
        for (int i = 0; i < num; i++) {
            brave[i] = Integer.parseInt(in.next());
        }
        int total = 0;
        int capa = 0;
        int capb = city[0];
        for (int i = 0; i < num; i++) {
            capa = capb;
            capb = city[i + 1];
            int diff = capa - brave[i];
            if (diff >= 0) {
                total += brave[i];
                continue;
            } else {
                total += capa;
                capb += diff;
                if (capb < 0) {
                    total += capb - diff;
                    capb = 0;
                } else {
                    total -= diff;
                }
            }
        }
        System.out.println(total);
    }
}