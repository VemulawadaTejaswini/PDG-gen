
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static int N,A ;
    static int[] list = new int[51];
    static long ans = 0 ;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        for(int i = 0 ; i < N ; i++)
            list[i] = sc.nextInt();
        Arrays.sort(list);
        bt(0,0,0);
        System.out.println(ans);
    }
    static void bt(int idx,int sum, int count){
       
        if(count!=0 && sum%count==0 && sum/count==A)
            ans++;

        for(int i = idx ; i < N ; i++)
        {
            bt(i+1, sum+list[i], count+1);
        }
    }
}
