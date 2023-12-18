import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
            min = Math.min(min,arr[i]);
            max = Math.max(max, arr[i]);
        }
        int rem = k%(min+max);
        if(k<(min+max)){
            System.out.println("first");
            return;
        }
        for (int i=0;i<n;i++) {
            if(rem == arr[i]){
                System.out.println("first");
                return;
            }
        }
        System.out.println("second");
    }
}