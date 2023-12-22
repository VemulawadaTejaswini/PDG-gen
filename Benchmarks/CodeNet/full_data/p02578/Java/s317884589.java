import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 配列
        int[] a = new int[n];
        a[0] = sc.nextInt();
        int mx = a[0];
        long sum = 0;
        for(int i=1;i<n;i++){
            a[i] = sc.nextInt();
            if(a[i] < mx) {
                sum += (mx - a[i]);
            } else {
                mx = a[i];
            }
        }
            System.out.println(sum);

    }
   
}

