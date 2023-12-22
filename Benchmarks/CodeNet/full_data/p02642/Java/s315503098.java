
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int ans = 0;
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]%a[j]==0){
                    break;
                }
                if(j==n-1){
                    ans +=1;
                }
            }
        }

        System.out.println(ans);

        scn.close();

    }

}