// 2013 7/2
import java.lang.*;
import java.util.*;
//0022
public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            
            int[] a = new int[5001];
            int max = 0;
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                int sum = 0;
                for(int j=i; j<n; j++){
                    sum += a[j];
                    if(max < sum) max = sum;                    
                }
            }
            System.out.println(max);
            
        }
    }
}

	    
	    