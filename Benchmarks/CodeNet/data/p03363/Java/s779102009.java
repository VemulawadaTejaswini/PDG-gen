import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N+1];
        for(int i = 1;i <= N;i++){
            a[i] = sc.nextLong();
        }
        long count = 0;
        long[] s = new long[N+1];
        s[0] = 0;
        for(int i = 1;i <= N;i++){
            s[i] = s[i-1] + a[i];
        }
        //System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        //System.out.println(Arrays.toString(s));
        for(int i = 0;i <= N;i++){
            long x = s[i];
            for(int j = i+1;j <= N;j++)
                if(s[j] == x){
                    count++;
                }
        }
        System.out.println(count);
    }
}
