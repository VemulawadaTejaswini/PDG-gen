import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] h = new int[a];
        int[] h2 = new int[a];
        int ans = 0;
        for(int i=0;i<a;i++){
            h[i] = scan.nextInt();
        }
        for(int i=0;i<b;i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            if(h[A-1]>h[B-1]){
                h2[B-1]=1;
            }else if(h[A-1]<h[B-1]){
                h2[A-1]=1;
            }else if(h[A-1]==1||h[B-1]==1){
                h2[A-1]=1;
                h2[B-1]=1;
            }
        }
        for(int l=0;l<a;l++){
            if(h2[l]==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
