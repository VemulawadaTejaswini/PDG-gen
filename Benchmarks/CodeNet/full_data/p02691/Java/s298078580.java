import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int cnt = 0;
        for (int i=0; i<n-1; i++){
            for (int j=i+2; j<n; j++){
                if (j-i == a[i]+a[j]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}