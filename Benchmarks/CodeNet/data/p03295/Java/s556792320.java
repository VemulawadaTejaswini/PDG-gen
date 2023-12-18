import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] ab = new int[M][2];
        for(int i=0;i<M;i++){
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
        }
        Main.myComparator mc = new Main.myComparator();
        Arrays.sort(ab,mc);
        int ans = 1;
        int i=1;
        int left=ab[0][0];
        int right = ab[0][1];
        while(i<M){
            left = Math.max(left,ab[i][0]);
            right = Math.min(right,ab[i][1]);
            if(left>=right){
                ans++;
                left = ab[i][0];
                right = ab[i][1];
            }
            i++;
        }




        System.out.println(ans);
    }
    public static class myComparator implements Comparator<int[]>{
        @Override
        public int compare(int[] o1, int[] o2) {
            if(o1[0]-o2[0]!=0) return (o1[0]-o2[0]);
            else return o1[1]-o2[1];
        }
    }
}