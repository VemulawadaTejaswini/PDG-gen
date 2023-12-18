import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double m = sc.nextDouble();
        double a[] =new double[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextDouble();
        double all = 0;
        for(int i=0;i<n;i++)
            all+=a[i];
        double und = all / (4 * m);
            int ans =0;
        for(int i=0;i<n;i++){
            if(a[i]>=und){
                ans++;
            }
        }
            if(ans>=m){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }