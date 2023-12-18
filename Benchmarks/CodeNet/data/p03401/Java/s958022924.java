import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+2];
        int sum =0;
        
        for(int i=1; i<n+1; i++){
            a[i] =sc.nextInt();
            sum += (int)(Math.abs(a[i] - a[i-1]));
        }
        //最後の目的地から0までの距離を足す。
        sum += (int)(Math.abs(a[n+1]-a[n]));

        for(int i=1; i<n+1; i++){
            int p = (int)(Math.abs(a[i+1]-a[i-1]));
            int m = (int)(Math.abs(a[i+1]-a[i])) + (int)(Math.abs(a[i]-a[i-1]));
            System.out.println(sum+p-m);
        }
        
    }
}
