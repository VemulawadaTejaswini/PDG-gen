import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];

        for(int i = 0; i < n+1; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }

        long killCount = 0;

        for(int i = 0; i < n; i++){
            if(a[i] < b[i]){
                int cost = a[i];
                killCount += cost;
                a[i] -= cost;
                b[i] -= cost;

                if(a[i+1] < b[i]){
                    int costp = a[i+1];
                    killCount += costp;
                    a[i+1] -= costp;
                    b[i] -= costp;
                } else {
                    int costp = b[i];
                    killCount += costp;
                    a[i+1] -= costp;
                    b[i] -= costp;
                }
            } else {
                int cost = b[i];
                killCount += cost;
                a[i] -= cost;
                b[i] -= cost;
            }
        }
        System.out.println(killCount);
    }
}
