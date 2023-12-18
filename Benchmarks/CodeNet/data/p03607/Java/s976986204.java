import java.util.*;
//System.out.println("")

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        Long[] a = new Long[n];
        for(int i=0; i<n; i++){
            Long b = sc.nextLong();
            a[b] = a[b] + 1;
        }
        for(int i=0; i<n; i++){
            if(a[i]%2 == 1){
                cnt++;
            }
        }
        System.out.println(cnt);
        
        
    }
}