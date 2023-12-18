import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[][] range = new int[m][2];
        for(int i=0;i<m;i++){
            range[i][0] = Integer.parseInt(sc.next());
            range[i][1] = Integer.parseInt(sc.next());
        }

        Arrays.sort(range,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
        });
        int f = 0,ans = 0;
        for(int i=0;i<m;i++){
            if(range[i][0]>=f){
                ans++;
                f = range[i][1];
            }
        }
        System.out.print(ans);
        System.out.flush();
    }
}