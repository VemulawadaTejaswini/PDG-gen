import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        arr[0]  = sc.nextInt();
        int max = arr[0];
        int maxi = 0;
        int max2 = -1;

        for(int i = 1;i < n;i++){
            arr[i]  = sc.nextInt();
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
                maxi = i;
            } else if (arr[i] > max2){
                max2 = arr[i];
            }
        }

        for(int i = 0;i < n;i++){
            if(i == maxi){
                System.out.println(max2);
            } else {
                System.out.println(max);
            }
        }
    }
}

