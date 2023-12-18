import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int max = 0;
        for (int i = 0; i < n-1; i++) {
            int count = 0;
            for (int j = 0; j < 26; j++) {
                String str1 = s.substring(0, i+1);
                String str2 = s.substring(i+1, n);
                if (str1.contains(String.valueOf((char)('a'+j))) && str2.contains(String.valueOf((char)('a'+j)))) {
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
