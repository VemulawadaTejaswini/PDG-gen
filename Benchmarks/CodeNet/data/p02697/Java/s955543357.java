import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[m][2];

        for (int i=m/2; i<m; i++) {
            arr[i][0] = i + 1;
            arr[i][1] = n - i;
        }

        for (int i=0; i<m/2; i++) {
            arr[i][0] = i + 1;
            arr[i][1] = arr[i][0] + (arr[m-1-i][0] - arr[m-1-i][1]) - 1;
        }

        for (int i=0; i<m; i++) {
//            arr[i][1] += n;
            arr[i][1] %= n;
        }

        StringBuffer sb = new StringBuffer();

        for (int i=0; i<m; i++) {
            sb.append(arr[i][0] + " ");
            sb.append(arr[i][1] + "\n");
        }

        System.out.println(sb.toString());
    }


}
