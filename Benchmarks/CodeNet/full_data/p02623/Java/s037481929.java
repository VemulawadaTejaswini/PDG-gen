import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        while(k>0){
            int i=0;
            k-=a[i];
            cnt++;
            k-=b[i];
            cnt++;
            i++;
        }
        System.out.println(cnt);
    }
}