import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int m = Integer.parseInt(s.next());
        boolean[] goodTen = new boolean[n];
        int[] h = new int[n];
        for (int i = 0;i<n;i++) {
            goodTen[i] = true;
        }
        for(int i=0; i<n;i++){
            h[i] = Integer.parseInt(s.next());
        }

        int[] a = new int[m];
        int[] b = new int[m];
        for(int i=0; i<m ;i++){
            a[i] = Integer.parseInt(s.next());
            b[i] = Integer.parseInt(s.next());

            if(h[a[i]-1] > h[b[i]-1]) {
                goodTen[b[i]-1] = false;
            } else if(h[a[i]-1] < h[b[i]-1]){
                goodTen[a[i]-1] = false;
            } else {
                goodTen[a[i]-1] = false;
                goodTen[b[i]-1] = false;
            }
        }

        int res = 0;
        for (boolean bol:goodTen) {
            if (bol) {
                res++;
            }
        }

        System.out.println(res);
    }
}