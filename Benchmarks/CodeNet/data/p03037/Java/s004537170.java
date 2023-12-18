import java.util.*;
public class Main { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        for(int i = 0; i < m; i++) {
           arr[i][0] = sc.nextInt();
           arr[i][1] = sc.nextInt();
        }
        int start = arr[0][0];
        int end = arr[0][1];
        for(int i = 1; i < m; i++) {
            start = Math.max(start, arr[i][0]);
            end = Math.min(end, arr[i][1]);
        }
        if(end - start >= 0)
            System.out.println(end - start + 1);
        else
            System.out.println(0);
    }

}