

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String s = sc.next();
        int[] arr = new int[s.length()];
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == 'C' && s.charAt(i-1) == 'A') {
                arr[i] = arr[i-1] + 1;
            } else {
                arr[i] = arr[i-1];
            }
        }

        for(int i = 0; i < Q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            l--;
            r--;
            System.out.println(arr[r] - arr[l]);
        }
    }
}
