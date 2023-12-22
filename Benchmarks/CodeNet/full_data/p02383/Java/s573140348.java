import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dice = new int[6];
        int cnt = 0;
        while (scan.hasNextInt()) {
            dice[cnt] = scan.nextInt();
            cnt ++;
        }
        String mark = scan.next();
        String hougaku = "";
        for (int i = 0; i < mark.length(); i++) {
            hougaku = mark.substring(i, i + 1);
            int irekae = 0;
            if (hougaku.equals("S")) {
                irekae = dice[0];
                dice[0] = dice[4];
                dice[4] = dice[5];
                dice[5] = dice[1];
                dice[1] = irekae;
            } else if (hougaku.equals("N")) {
                irekae = dice[0];
                dice[0] = dice[1];
                dice[1] = dice[5];
                dice[5] = dice[4];
                dice[4] = irekae;
            } else if (hougaku.equals("W")) {
                irekae = dice[0];
                dice[0] = dice[2];
                dice[2] = dice[5];
                dice[5] = dice[3];
                dice[3] = irekae;
            } else if (hougaku.equals("E")) {
                irekae = dice[0];
                dice[0] = dice[3];
                dice[3] = dice[5];
                dice[5] = dice[2];
                dice[2] = irekae;
            }
        }
        scan.close();
        System.out.println(dice[0]);
    }
}