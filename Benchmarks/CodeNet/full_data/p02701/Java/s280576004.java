import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
        String[] S = new String[N];
        Integer typeNum = 1;

        for (int i = 0; i < N; i++) {
            S[i] = input.next();
            for (int j = 0; j < i; j++) {
                if (S[i].equals(S[j])) {
                    break;
                } else if (j == (i - 1)) {
                    typeNum++;
                } else {
                    continue;
                }
            }
        }

        System.out.println(typeNum);
    }
}