import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int sa = 0, sb = 0;
        for(int i=0; i<n; i++){
            if(i%2 == 0){
                sa += a[n - i - 1];
            }else{
                sb += a[n - i - 1];
            }
        }
        System.out.println(sa - sb);
    }   
}