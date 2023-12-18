import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] result = new int[N];
        for(int i = 1; i <= N; i++){
            for(int j = i + 1; j <= N; j++){
                int min = Integer.MAX_VALUE;
                if(min > Math.abs(j-i)) min = Math.abs(j-i);
                if(min > Math.abs(X-i) + 1 + Math.abs(j-Y)) min = Math.abs(X-i) + 1 + Math.abs(j-Y);
                if(min > Math.abs(Y-i) + 1 + Math.abs(j-X)) min = Math.abs(X-i) + 1 + Math.abs(j-Y);
                result[min]++;
            }
        }
        for(int i = 1; i < N; i++){
            System.out.println(result[i]);
        }
    }
} 