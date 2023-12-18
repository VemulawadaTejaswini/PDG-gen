
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[][] ab = new int[n][2];
        for(int i=0;i<n;i++){
            ab[i][0] = Integer.parseInt(sc.next());
            ab[i][1] = Integer.parseInt(sc.next());
        }
        Arrays.sort(ab,new Comparator<int[]>(){

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        }
        );
        int remain = m;
        int res = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(remain==0)break;
            count = Math.min(remain,ab[i][1]);
            res+=count*ab[i][0];
            remain-=count;
        }
        System.out.println(res);
        sc.close();
    }
    
}