import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] timeArray = new int[n];
        int sum = 0;
        for (int i=0;i<n;i++){
            timeArray[i] = sc.nextInt();
            sum += timeArray[i];
        }
        int m = sc.nextInt();
        for (int j=0;j<m;j++){
            int index = sc.nextInt()-1;
            int x = sc.nextInt();
            System.out.println(sum-(timeArray[index]-x));
        }
    }
}