import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String S = sc.next();
            int count = 0;
            for (int i = 1; i <= S.length(); i++) {
                for (int j = 0; j <= S.length(); j++) {
                    if (i < j && Long.parseLong(S.substring(i,j)) % 2019 == 0) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}