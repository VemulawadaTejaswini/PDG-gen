import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i, g=0, h, ans=0;
        int[] array = new int[101];
        for(i=0;i<n;i++){
            array[i] = sc.nextInt();
            g+=array[i];
        }
        h = Math.round((float)g/n);
        for(i=0;i<n;i++)
            ans += Math.pow(h-array[i],2);
        System.out.println(ans);
    }
}