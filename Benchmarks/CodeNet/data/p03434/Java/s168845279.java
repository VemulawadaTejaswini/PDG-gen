import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Cards[] = new int[N];
        for (int i = 0; i <= N - 1; i++) {
            Cards[i] = sc.nextInt();
        }
        int alice = 0;
        int bob = 0;
        int j;
        while (true) {
            j = calc(Cards);
            alice += Cards[j];
            Cards[j] = 0;
            j = calc(Cards);
            bob += Cards[j];
            Cards[j] = 0;
            j = calc(Cards);
            if (Cards[j] == 0) {
                break;
            }
        }
        System.out.println(alice - bob);
        sc.close();

    }

    public static int calc(int num[]) {
        int max = 0;
        int listNumber = 0;
        for (int i = 0; i <= num.length - 1; i++) {
            if (num[i] >= max) {
                max = num[i];
                listNumber = i;
            }
        }
        return listNumber;
    }

}