import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] lookW = new int[n];
        int[] lookE = new int[n];
        if(s.charAt(0)=='E') {
            lookE[0] = 1;
        } else {
            lookW[0] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == 'E') {
                lookE[i] = lookE[i - 1] + 1;
                lookW[i] = lookW[i - 1];
            } else {
                lookE[i] = lookE[i - 1];
                lookW[i] = lookW[i - 1] + 1;
            }
        }
        long ans = Long.MAX_VALUE;
        ans = Math.min(ans, lookE[n-1]-lookE[0]);
        for(int i = 1; i < n; i++) {
            ans = Math.min(ans, lookW[i-1]+lookE[n-1]-lookE[i]);
        }
        System.out.println(ans);
    }
}