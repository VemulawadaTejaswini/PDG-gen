import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.nextLine();

        int max_sum = 0;
        int max_index = 0;
        for (int i = 0; i < N; i++) {
            String sub1 = S.substring(0, i);
            String sub2 = S.substring(i);

            int sum = 0;
            for (int i1 = 0; i1 < sub1.length(); i1++) {
                char char1 = sub1.charAt(i1);
                for (int i2 = 0; i2 < sub2.length(); i2++) {
                    char char2 = sub2.charAt(i2);
                    if (char1 == char2) {
                        sum++;
                    }
                }
            }

            if (sum > max_sum) {
                max_index = i;
            }
        }
        
        System.out.println(max_index);
    }
}
