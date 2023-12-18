import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int cnt_2 = 0;
        int cnt_4 = 0;
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            if(i%4==0) {
                cnt_4++;
            }else if(i%2==0) {
                cnt_2++;
            }
        }
        if(cnt_2>1) n = n - cnt_2 +1;
        
        if(cnt_4>=n-cnt_4-1) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}