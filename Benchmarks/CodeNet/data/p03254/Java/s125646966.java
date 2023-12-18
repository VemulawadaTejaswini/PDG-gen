import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt(),a[]=new int[n],s=0;
        for(int i=0;i<n;++i)a[i]=sc.nextInt();
        sc.close();
        Arrays.sort(a);
        for(int i=0;i<n;++i){
            if(x>=a[i]){
                x-=a[i];
                ++s;
            }
        }
        if(x==a[n-1])++s;
        System.out.print(s);
    }
}