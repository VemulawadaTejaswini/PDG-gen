import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int min = 1000;
            int max = 0;
            int sum = 0;

            int[] tensuu = new int[n];
            for (int i = 0; i < tensuu.length; i++) {
                tensuu[i] = sc.nextInt();
                if(tensuu[i] <= min){
                    min = tensuu[i];
                }
                if(tensuu[i] >= max){
                    max = tensuu[i];
                }
                sum += tensuu[i];
            }
            System.out.println((sum - max - min)/(n - 2));
        }
    }
}