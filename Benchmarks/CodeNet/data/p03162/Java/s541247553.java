
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[][] = new int[n][3];
        for(int i=0;i<n;i++){
            ar[i][0] = sc.nextInt();
            ar[i][1] = sc.nextInt();
            ar[i][2] = sc.nextInt();
        }
        System.out.println(solve(ar));
    }
    public static int solve(int ar[][]){
        int n = ar.length;
        for(int i=1;i<n;i++){
            ar[i][0] += Math.max(ar[i-1][1],ar[i-1][2]);
            ar[i][1] += Math.max(ar[i-1][0],ar[i-1][2]);
            ar[i][2] += Math.max(ar[i-1][1],ar[i-1][0]);
        }
        return Math.max(ar[n-1][0],Math.max(ar[n-1][1],ar[n-1][2]));
    }
}