import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        System.out.println(findmin(arr, 0, new int[10001]));
    }

    public static int findmin(int arr[], int i, int strg[]){
        if(i<arr.length && strg[arr[i]] != 0){
            return strg[arr[i]];
        }

        if(i >= arr.length){
            return arr[arr.length-1];
        }

        int l = Integer.MAX_VALUE;
        int r = Integer.MAX_VALUE;
        if(i+1 < arr.length)
            l = Math.abs(arr[i] - arr[i+1]) + findmin(arr, i+1, strg);
        if(i+2 < arr.length)
            r = Math.abs(arr[i] - arr[i+2]) + findmin(arr, i+2, strg);

        strg[arr[i]] = Math.min(l, r) == Integer.MAX_VALUE ? 0 : Math.min(l, r);

        return strg[arr[i]];
    }
}