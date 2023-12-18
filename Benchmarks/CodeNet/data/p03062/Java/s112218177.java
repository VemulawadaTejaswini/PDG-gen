import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int cnt=0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            if(a[i]<0) cnt++;
        }
        long sum = 0;
        for(int i =0; i<n; i++){
            sum += Math.abs(a[i]);
        }
        int min = 1_000_000_001;
        if(cnt%2==0){
            System.out.println(sum);
            return;
        }else{
            for(int i =0; i<n; i++){
                min = Math.min(Math.abs(a[i]),min);
            }
            sum -= (int)min;
            System.out.println(sum);
        }
    }
}