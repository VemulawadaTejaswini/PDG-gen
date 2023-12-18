import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for(int i = 0; i < n; i++) {
        	a[i][0] = sc.nextInt();
        	a[i][1] = i+1;
        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];    //[0] をキーにソート(昇順)
                //return o2[0] - o1[0];    //[0] をキーにソート(降順)
            }
        });

        for(int i = 0; i < n; i++) {
        	System.out.println(a[i][1]);
        }

        return;
    }


}