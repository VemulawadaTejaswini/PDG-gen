
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int count[] = new int[100001];
        for(int i : a){
            count[i]++;
        }
        
        int q = sc.nextInt();
        int[] b = new int[q], c = new int[q];
        for(int i=0;i<q;i++){
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        for(int i=0;i<q;i++){
            sum += count[b[i]] * (c[i] - b[i]);
            System.out.println(sum);
            count[c[i]] += count[b[i]];
            count[b[i]] = 0;
        }
        
    }
}
