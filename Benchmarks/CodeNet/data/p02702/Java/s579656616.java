import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Sstr = sc.next();
        int result = 0;
        for (int j = 1; j <= Sstr.length()+1; j++) {
            for (int i = 1; i <= j; i++) {
                String substr = Sstr.substring(i - 1, j - 1);
                if (!substr.isEmpty() && Long.parseLong(substr) % 2019 == 0) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}