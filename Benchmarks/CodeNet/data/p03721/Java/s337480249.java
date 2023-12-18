import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextInt();
        long[] l = new long[100001];
        long count = 0;
        for(int i = 0;i < N;i++)    l[sc.nextInt()] += sc.nextLong();
        for(int i = 0;i < 100001;i++){
            count += l[i];
            if(count >= K){
                System.out.println(i);
                return;
            }
        }
    }
}