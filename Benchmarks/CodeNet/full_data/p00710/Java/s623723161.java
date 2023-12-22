import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        while(n != 0 || r != 0) {

            String[] card = new String[n + 1];

            card[0] = "\0";

            for (int i = n; i > 0; i--)
                card[i] = String.valueOf(i);

            for (int i = 0; i < r; i++) {
                String[] suffledCard = new String[n + 1];
                for (int l = n; l > 0; l--)
                    card[l] = String.valueOf(l);
                suffledCard[0] = "\0";

                int p = sc.nextInt();
                int c = sc.nextInt();
                int k = n;

                for (int j = n - (p - 1); j > n - (c + p - 1); j--)
                    suffledCard[k--] = card[j];
                for (int j = n; j > n - (p - 1); j--)
                    suffledCard[k--] = card[j];
                for (int j = n - (c + p - 1); j > 0; j--)
                    suffledCard[k--] = card[j];

                card = suffledCard;
            }

            System.out.println(card[n] + 1);

            n = sc.nextInt();
            r = sc.nextInt();
        }

        sc.close();
    }
}

