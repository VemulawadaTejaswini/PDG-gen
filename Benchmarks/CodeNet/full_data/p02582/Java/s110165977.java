import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int maxCnt = 0;
        int currentCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R') {
                currentCnt++;
            } else {
                currentCnt = 0;
            }
            maxCnt = Math.max(maxCnt, currentCnt);
        }

        System.out.println(maxCnt);
    }
}