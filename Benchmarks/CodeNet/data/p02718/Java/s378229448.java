import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int c = 0;
        int total = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            total += a[i];
        }
        for(int i = 0; i < n; i++){
            if((a[i] * 4 * m ) >= total){
                c++;
            }
        }
        System.out.println((c >= m) ? "Yes" : "No");
    }
}