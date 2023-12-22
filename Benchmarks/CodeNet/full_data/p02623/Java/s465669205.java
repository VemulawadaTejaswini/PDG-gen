import java.util.*;

public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        int[] a = new int[n];
        for(int i= 0;i<n;i++)a[i]=sc.nextInt();
        int[]b = new int[m];
        for(int i = 0;i<m;i++)b[i]=sc.nextInt();
        long minute = 0;
        int count =0;
        int i = 0,j=0;
        while(true){
            if(((i==n&&j==m)||(i!=n&&minute+a[i]>k)&&(j!=m&&minute+b[j]>k))){
                break;
            }
            if(i!=n&&j!=m&&a[i]<b[j]){
                minute += a[i];
                i++;
                count ++;
            }else if(i!=n&&j!=m&&a[i]>b[j]) {
                minute+= b[j];
                j++;
                count ++;
            }else if(i==n&&j!=m){
                minute += b[j];
                j++;
                count++;
            }else if(i!=n&&j==m){
                minute += a[i];
                i++;
            }
        }
        System.out.println(count);
}
}
