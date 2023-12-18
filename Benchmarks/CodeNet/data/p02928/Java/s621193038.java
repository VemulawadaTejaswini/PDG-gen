import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        int mod = (int)1e9 + 7;

        long count = 0;
        for (int i=0; i<n-1; i++){
            for (int j=1; j<n; j++){
                if (arr[i]>arr[j]) count++;
            }
        }

        long count1 = 0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (arr[i]>arr[j]) count1++;
            }
        }
        
        

        System.out.println(count*k%mod + count1*k*(k-1)/2%mod);



    }
}