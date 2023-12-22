import java.util.Scanner;

public class Main{
    public static void cut(int[] a, int p, int c){
        int[] temp = new int[c];
        for(int i=0; i<c; i++) temp[i] = a[p+i-1];
        for(int i=p-2; i>=0; i--) a[i+c] = a[i];
        for(int i=0; i<c; i++) a[i] = temp[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n==0 && r==0) break;
            int[] Num = new int[n];
            for (int i = 1; i <= n; i++) Num[n - i] = i;
            for (int i = 1; i <= r; i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                cut(Num, p, c);
            }
            System.out.println(Num[0]);
        }
    }
}
