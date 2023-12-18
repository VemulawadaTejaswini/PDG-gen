import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            a[i] = a[i] - i-1;
        }
        Arrays.sort(a);
        int b = 0;
        if(n%2 == 0){
            b = a[n/2 - 1];
        }else{
            b = a[(n+1)/2 - 1];
        }

        long f = 0;
        for(int i=0; i<n; i++){
            f += Math.abs(a[i] - b); 
        }
        System.out.println(f);
    }
}
