import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int temp = 0;
        for(int i = 0; i < arr.length-1; i++) {
            temp++;
            if(arr[i] == arr[i+1]) {
                if(i == arr.length-2) {
                    temp++;
                    if(temp % 2 == 1) {
                      count++;
                    }
                    temp = 0;
                }
            }
            else {
                if(temp % 2 == 1) {
                    count++;
                }
                temp = 0;
                if(i == arr.length-2) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}