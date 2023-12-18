import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n-1];
        int sum = 0;
        int newsum = 0;
        for(int i = 0; i < n+1; i ++){
            a[i] = scan.nextInt();
            sum += a[i];
        }
        for(int i = 0; i < n; i ++){
            b[i] = scan.nextInt();
        }
        for(int j = n+1; j > 0 ; j--){
            int nokori = 0;
            if(b[j-1] >= a[j]){
                a[j] = 0;
                nokori = b[j-1] - a[j];
            }
            else{
                a[j] = a[j] - b[j-1];
            }
            a[j-1] = a[j-1] - nokori;
        }
        for(int i = 0; i < n; i ++){
            newsum += a[i];
        }
        System.out.print(sum - newsum);
        scan.close();
    }
}