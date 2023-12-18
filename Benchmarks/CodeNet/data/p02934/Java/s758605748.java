

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        double ans=0.0;
        for(int i=0;i<n;i++){
            ans+=(double)1/num[i];
        }
        System.out.println(1/ans);
    }
}
