import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = ans^a[i];
        }
        if(ans==0) System.out.println("Yes");
        else System.out.println("No");

    }
}


