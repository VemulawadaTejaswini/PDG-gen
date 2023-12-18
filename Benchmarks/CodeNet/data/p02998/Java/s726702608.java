import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
//        HashMap<Integer, Integer> left = new HashMap<Integer, Integer>();
//        HashMap<Integer, Integer> right = new HashMap<Integer, Integer>();
        int[] left = new int[100001];
        int[] right = new int[100001];

        for(int i = 0; i<n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            left[a[i][0]]++;
            right[a[i][1]]++;
        }
        long ans = 0;
        for(int i = 0; i<n; i++) {
            ans += Math.max(0,left[a[i][0]]-1)*Math.max(0,right[a[i][1]]-1);
        }
        System.out.println(ans);

    }
}
