import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] ab= new int[n][2];
        for(int i=0;i<n;i++){
            ab[i][0] = Integer.parseInt(sc.next());
            ab[i][1] = Integer.parseInt(sc.next());
        }

        Arrays.sort(ab,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1]-o2[1];
			}
        });
        int t = 0;
        for(int i=0;i<n;i++){
            t+=ab[i][0];
            if(t>ab[i][1]){
                System.out.print("No");
                System.out.flush();
                return;
            }
        }
        System.out.print("Yes");
        System.out.flush();
        return;
    }
}