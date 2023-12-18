import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();

            int x = 0;
            while(x < b){
                int minindex = 0;
                for(int j = 1; j < a.length; j++){
                    if(a[minindex] > a[j]) minindex = j;
                }
                if(a[minindex] < c) {
                    a[minindex] = c;
                    x++;
                } else {
                    break;
                }
            }
        }

        long result = 0;
        for(int i = 0; i < n; i++){
            result += a[i];
        }
        System.out.println(result);

    }
}
