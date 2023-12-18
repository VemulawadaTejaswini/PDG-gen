import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        int max  =-1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            max = Math.max(arr[i],max);
        }
        long a = -1;
        for(int i=0;i<=1000000;i++){
            long ans= 0;
            for(int j=0;j<n;j++){
                ans+=i%arr[j];
            }
            a = Math.max(a, ans);
        }
        System.out.println(a);
    }
}
