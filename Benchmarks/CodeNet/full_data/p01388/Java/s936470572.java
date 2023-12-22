import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int minCount = 100000;
        for (char c: "KUPC".toCharArray()) {
            int count = 0;
            for (int i = s.indexOf(c, 0); i != -1; i = s.indexOf(c, i+1)) count++;
            minCount = Math.min(minCount, count);
        }
        System.out.println(minCount);
    }

}