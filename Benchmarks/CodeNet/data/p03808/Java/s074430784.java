import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }

        if(sum % (n * (n+1) / 2) != 0){
            System.out.println("NO");
            return;
        }

        if(n == 1){
            System.out.println("YES");
            return;
        }else if(n == 2 && Math.abs(a[0] - a[1]) <= 1){
            System.out.println("YES");
            return;
        }

        int num = (int)(sum / (n * (n+1) / 2));
        int pos = 0;
        for(int i=0; i<num; i++){
            int max = 0;
            for(int j=pos; j<n+pos; j++){
                int mj = j;
                if(mj >= n) mj -= n;
                if(a[mj] > max){
                    max = a[mj];
                    pos = mj;
                }
            }
            culc(a, n, pos+1);
        }

        for(int i=0; i<n; i++){
            if(a[i] != 0){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    public static void culc(int[] a, int n, int pos){
        for(int i=0; i<n; i++){
            int mpos = pos + i;
            if(mpos >= n) mpos -= n;
            a[mpos] -= i+1;
        }
    }
}