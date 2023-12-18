import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int[] d = new int[n];
        for(int i=0; i<n; i++){
            d[i] = stdIn.nextInt();
        }

        quick_sort(d, 0, d.length-1);

        if(n%2 == 1){
            System.out.println(0);
        }else{
            System.out.println(d[n/2] - d[n/2-1]);
        }
    }

    static void quick_sort(int[] d, int left, int right) {
        if (left>=right) {
            return;
        }
        int p = d[(left+right)/2];
        int l = left, r = right, tmp;
        while(l<=r) {
            while(d[l] < p) { l++; }
            while(d[r] > p) { r--; }
            if (l<=r) {
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, left, r);  // ピボットより左側をクイックソート
        quick_sort(d, l, right); // ピボットより右側をクイックソート
    }
}