import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] blackSum = new int[n+1];
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '#') blackSum[i+1] = blackSum[i] + 1;
            else blackSum[i+1] = blackSum[i];
        }
        int min = n;
        for(int i = 0; i < n+1; i++) {
            int rightBlack = blackSum[i] - blackSum[0];
            int leftBlack = blackSum[n] - blackSum[i];
            int leftWhite = n - i - leftBlack;
            min = Math.min(min, rightBlack+ leftWhite);
        }
        System.out.println(min);
    }
}
