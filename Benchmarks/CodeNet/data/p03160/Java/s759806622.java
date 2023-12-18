import java.util.Scanner;

public class Main {

    public static int ans(int stones[], int n){
        int storage[] = new int[n+1];
        storage[1] = 0;
        for(int i=2; i<=n; i++){
            int option1 = Math.abs(stones[i] - stones[i-1]) + storage[i-1];
            int option2 = (i==2) ? Integer.MAX_VALUE : Math.abs(stones[i] - stones[i-2]) + storage[i-2];
            storage[i] = Math.min(option1, option2);
        }
        return storage[n];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stones[] = new int[n+1];
        for(int i=1; i<=n; i++){
            stones[i] = sc.nextInt();
        }
        System.out.println(ans(stones, n));
    }
}