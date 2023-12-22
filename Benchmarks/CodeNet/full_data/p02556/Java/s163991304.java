import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i] = new int[]{sc.nextInt(),sc.nextInt()};
        }
        Arrays.sort(arr,(a,b) -> a[1]-b[1]);
        int[] min = arr[0];
        int[] max = arr[0];
        long ans = 0;
        for(int i=1;i<n;i++){
            ans = Math.max(Math.max(cmp(min,arr[i]),cmp(max,arr[i])),ans);
            if(arr[i][0]>max[0]){
                if(arr[i][1]-max[1]<arr[i][0]-max[0]) max = arr[i];
            }
            if(arr[i][0]<min[0]){
                if(arr[i][1]-min[1]<min[0]-arr[i][0]) min = arr[i];
            }
        }
        System.out.println(ans);


    }
    static long cmp(int[] a, int[] b){
        return (long)Math.abs(a[0]-b[0])+(long)Math.abs(a[1]-b[1]);
    }
}