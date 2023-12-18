import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
 
        if (K == 1) {
            System.out.println(0);
        }
 
        int T = sc.nextInt();
        int[] a = new int[T];
 
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
 
        int fIndex = 0;
        int sIndex = 1;
        if (a[0] < a[1]) {
            fIndex = 1;
            sIndex = 0;
        }
 
        for (int i = 0; i < K / 2; i++) {
 
            for (int j = 0; j < a.length; j++) {
                if (a[j] > a[fIndex]) {
                    sIndex = fIndex;
                    fIndex = j;
                } else if (a[j] > a[sIndex] && j != fIndex) {
                    sIndex = j;
                }
            }
 
            if (a[sIndex] == 0) {
                System.out.println(a[fIndex] - 1);
                return;
            }
 
            a[fIndex]--;
            a[sIndex]--;
        }
        System.out.println(0);
    }
}