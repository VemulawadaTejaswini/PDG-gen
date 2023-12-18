import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] k = new int[n];
        for (int i=1;i<n;i++){
            for (int j=i+1;j<=n;j++){
                k[Math.min(Math.abs(j-i),Math.min(Math.abs(x-i)+1+Math.abs(j-y),Math.abs(y-i)+1+Math.abs(j-x)))]++;
            }
        }
        for (int i=1;i<n;i++)System.out.println(k[i]);
    }
}
