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

        for (int i=0; i<m; i++) {
            arr[i][0] = i + 1;
            arr[i][1] = n - 1 - i;
        }

        StringBuffer sb = new StringBuffer();

        for (int i=0; i<m; i++) {
            sb.append(arr[i][0] + " ");
            sb.append(arr[i][1] + "\n");
        }

        System.out.println(sb.toString());
    }


}
