import java.util.*;
public class Main { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
           arr[i][0] = sc.nextInt();
           arr[i][1] = sc.nextInt();
        }
        long cnt = 0;

        Arrays.sort(arr, new Comparator<int[]>() {      
            @Override
            public int compare(int[] a, int[] b) {
                if(b[1]*1.0/b[0] == a[1]*1.0/a[0])
                    return b[0] - a[0];
                return (b[1]*1.0/b[0] - a[1]*1.0/a[0]) > 0 ? 1 : -1;
            }
        });

        while(h > 0) {
            for(int i = 0; i < n; i++) {
                if(arr[i][0] <= h || i == (n - 1)) {
                    h -= arr[i][0];
                    cnt += arr[i][1];
                    break;
                }
            }
        }
        System.out.println(cnt);
    }

}