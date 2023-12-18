import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] c =new int[N];
        int[] t =new int[N];
        
        for(int i=0;i<N;i++){
            c[i]=sc.nextInt();
            t[i]=sc.nextInt();
        }
        int ans = 1001;
        for(int i=0;i<N;i++){
            if(t[i]<=T){
                ans = Math.min(ans,c[i]);
            }
        }
        if(ans<=1000){
            System.out.println(ans);
        }else{
            System.out.println("TLE");
        }
    }
}