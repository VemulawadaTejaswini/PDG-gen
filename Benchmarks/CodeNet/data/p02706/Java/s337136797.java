
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];
        for(int i=0;i<m;i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for(int j=0;j<m;j++){
            sum = sum + a[j];
        }
        if(sum>n){
            System.out.println(-1);
            return;
        }
        n = n - sum;
        System.out.println(n);
    } 
}