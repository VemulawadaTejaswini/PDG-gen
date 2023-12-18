import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            char[] s = sc.next().toCharArray();
            int sum = 0;
            int min = 0;
            for (int j = 0; j < s.length; j++) {
                if(s[j] == '(') sum++;
                else sum--;
                min = Math.min(min, sum);
            }
            a[i][0] = sum;
            a[i][1] = min;
        }
        Arrays.sort(a, (x,y) -> y[1] - x[1]);
        int sum = 0;
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if(sum + a[i][1] < 0){
                ok = false;
                break;
            }
            sum += a[i][0];
        }
        System.out.println(ok && sum == 0 ? "Yes" : "No");
        sc.close();

    }

}
