//package  com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,k;
        n=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();
        sc.nextLine();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;++i)a[i]=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<m;++i)b[i]=sc.nextInt();
        int ans=0;
        long tot=0;
        for(int i=0;i<m;++i)tot+=b[i];
        int cur=0;
        int j=m-1;
        while(j>=0 && tot>k){tot-=b[j--];}
        if(j>=0)
        ans=Math.max(ans,j+1);
        for(int i=0;i<n;++i){
            cur+=a[i];

            while(j>=0 && tot>k-cur){tot-=b[j--];}
            if(j<0)break;
            ans=Math.max(ans,i+1+j+1);
        }
        System.out.println(ans);
    }
}