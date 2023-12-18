import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        for(int i=0;i<3;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[1]-a[0]+a[2]-a[1]);
    }
}
