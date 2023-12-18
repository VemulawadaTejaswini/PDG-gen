import java.util.*;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        long ans = 0;

        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        int[] b = new int[m];
        Pair[] c = new Pair[m];
//        int[] c = new int[m];

        for (int i=0; i<m; i++){
            int bCnt = sc.nextInt();
            int tmp = sc.nextInt();
            c[i] = new Pair(tmp, bCnt);
        }

        Arrays.sort(c);

        int idx = 0;

        for (int i=0; i<m; i++){
            int cnt = c[i].cnt;
            int change = c[i].change;
            while (arr[idx]<change && cnt>0){
                arr[idx] = change;
                idx++;
                cnt--;
            }
        }

        for (int i=0; i<n; i++){
            ans += arr[i];
        }

        System.out.println(ans);


    }

    public static class Pair implements Comparable<Pair>{
        int change;
        int cnt;
        Pair(int c, int i){
            this.change = c;
            this.cnt = i;
        }

        public int compareTo(Pair pair){
            if (this.change<pair.change) return 1;
            if (this.change>pair.change) return -1;
            return 0;
        }
    }
}

