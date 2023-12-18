import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();

        int[][] pos = new int[n][d];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < d; j++){
                pos[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for(int j = 1; j < n; j++){
            for(int i = 0; i < j; i++){
                int sum = getPow(pos[i], pos[j], d);
                //System.out.println(sum);
                if(isPow(sum)){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static boolean isPow(int n){
        for(int i = 0; i <= n; i++){
            if(n == i * i){
                return true;
            }
        }
        return false;
    }

    public static int getPow(int[] a, int[] b,  int d){
        int sum = 0;
        for(int i = 0; i < d; i++){
            sum += (a[i] - b[i]) * (a[i] - b[i]);
        }
        return sum;
    }
}