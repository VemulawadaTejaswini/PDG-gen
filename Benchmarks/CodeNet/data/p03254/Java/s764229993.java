import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int x=sc.nextInt();
        boolean all=true;
        int[] child=new int[N];
        int[] child_sorted;
        int[] sum=new int[N];
        for(int i=0;i<N;i++){
            child[i]=sc.nextInt();
        }
        child_sorted=sentaku(child);
        sum[0]=child_sorted[0];
        for(int i=1;i<child.length;i++){
            sum[i]=sum[i-1]+child_sorted[i];
        }
        for(int i=0;i<sum.length;i++){
            //全員には配れない
            if(x<sum[i]){System.out.println(i);all=false; break;}
        }
        if(all==true)System.out.println(N);
    }
    static int[] sentaku(int[] a){
        int min; int min_index=-1;
        int temp;
        for(int i=0;i<a.length;i++){
            min=Integer.MAX_VALUE;
            for(int j=i;j<a.length;j++){
                if(min>a[j]) {min=a[j]; min_index=j;}
            }
            temp=a[i];
            a[i]=min;
            a[min_index]=temp;
        }
        return a;
    }
}
