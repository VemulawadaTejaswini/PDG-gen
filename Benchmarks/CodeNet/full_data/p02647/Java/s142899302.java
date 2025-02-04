import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        //int k = 1000;

        int[] a = new int[n];
        int[] max = new int[n];
        Arrays.fill(max, n);

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            //a[i] = 0;
        }

        for(int i = 0; i < k; i++){
            int[] b = new int[n];
            for(int j = 0; j < n; j++){
                int l = Math.max(0, j - a[j]);
                int r = Math.min(n - 1, j + a[j]);
                b[l]++;
                if(r + 1 < n){
                    b[r + 1]--;
                }
            }
            for(int j = 1; j < n; j++){
                b[j] += b[j - 1];
            }

            if(Arrays.equals(b, max)){
                skip(n);
                return;
            }
            a = b;
        }

        StringBuilder sb = new StringBuilder();
        for(int i : a) {
            sb.append(i).append("\n");
        }
        System.out.print(sb.toString());

    }

    static void skip(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(n).append("\n");
        }
        System.out.print(sb.toString());
    }
}