import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer [] l = new Integer[N];
        int ans=0;
        for(int i =0; i<N;i++){
        l[i] =sc.nextInt();
        }
        Arrays.sort(l,Comparator.reverseOrder());
        for(int i=1; i<=K;i++){
            ans+=l[i];
        }
        System.out.println(ans);
    }

}