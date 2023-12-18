import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
        int a[] = new int[n];
        long sum=0;
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        
        if(sum == x){
            System.out.println(n);
        }else if(sum < x){
            System.out.println(n-1);
        }else{
            Arrays.sort(a);

            for(int i=0; i<n; i++){
                if(a[i]<=x){
                    x = x-a[i];
                }else{
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}