import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] count = new int[10][10];
        for(int i = 1; i <= n; i++){
            String str = String.valueOf(i);
            int first = Integer.parseInt(String.valueOf(str.charAt(0)));
            int last = Integer.parseInt(String.valueOf(str.charAt(str.length() - 1)));
            count[first][last]++;
        }
        long ans = 0;
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                ans += count[i][j] * count[j][i];
            }
        }
        System.out.println(ans);
    }
}
