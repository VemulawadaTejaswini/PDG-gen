
import java.util.Scanner;

/**
 * Created by yangyuyin on 16/10/8.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] rabbit = new int[N+1];
        for(int i=1;i<=N;i++){
            rabbit[i]=sc.nextInt();
        }
        int count=0;
        for(int i=1;i<=N;i++){
            int ai=rabbit[i];
            if(rabbit[ai]==i) count++;
        }
        count/=2;
        System.out.println(count);
    }
}