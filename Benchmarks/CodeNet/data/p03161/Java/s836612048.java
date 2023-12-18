import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int k=ob.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=ob.nextInt();
        }
        int min=0;
        int arr[]=new int[n];
        arr[0]=0;
        arr[1]=Math.abs(a[1]-a[0]);
        for(int i=2;i<a.length;i++){
            min=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    min=Math.min(arr[i-j]+Math.abs(a[i]-a[i-j]),min);
                    //System.out.println(min+" "+i+" "+j);
                }
            }
            arr[i]=min;
        }
        System.out.println(arr[n-1]);
        ob.close();
    }
}