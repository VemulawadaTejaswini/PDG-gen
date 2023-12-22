import java.util.*;
    public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            int sum = 0;
            for(int j=1; j<n; j++) {
                int key = a[j];
                int i = j - 1;
                while (i>=0 && a[i] > key) {
                    a[i+1] = a[i];
                    i--;
                }
                a[i+1] = key;
                sum = sum + key;
            }
            System.out.println(sum + a[0]);
        }
    }