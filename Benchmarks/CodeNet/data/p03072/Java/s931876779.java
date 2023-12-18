import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int cnt = 1;
        

        for(int i = 0 ;i<n;i++){
            h[i] = sc.nextInt();
        }
        int max = h[0];

        for(int i = 1;i<n;i++){
            if(h[i]>=max){
                cnt++;
            max = h[i];
            }
        }
       System.out.println(cnt);
    }
}
