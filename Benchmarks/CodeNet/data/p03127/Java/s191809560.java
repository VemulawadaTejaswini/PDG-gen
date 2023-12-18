import java.util.*;
import static java.lang.Math.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        boolean flag = true;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            min = min(a[i],min);
            if(i>1&&(a[i] != a[i-1])){
                flag = false;
            }
        }
        if(flag){
            System.out.println(a[0]);
            return;
        }
        int min_n = min;
        while(true){
            min = min_n;
            int sum = 0;
            for(int i=0; i<n; i++){
                a[i] = a[i] % min;
                if(a[i]!=0) min_n = min(min_n,a[i]);
                sum += a[i];
            }
            if(sum <= min_n){
                System.out.println(min_n % 2 ==1 ? "1" : "2");
                return;
            }
        }
    }
}