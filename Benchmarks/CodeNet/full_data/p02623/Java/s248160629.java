import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int count = 0;
        int ca = 0;
        int cb = 0;
        int caa=0;
        int cbb=0;
        int instance = 0;
        boolean bool = true;
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        for (int i=0;i<m;i++)b[i]=sc.nextInt();
        while (instance<=k&&bool){
            if (caa<n&&cbb<m){
                if (a[ca]<=b[cb]){
                    instance+=a[ca];
                    ca++;
                }else {
                    instance+=b[cb];
                    cb++;
                }
                count++;
            }else if (caa>=n&&cbb<m){
                instance+=b[cb];
                cb++;
                count++;
            }else if (caa<n){
                instance+=a[ca];
                ca++;
                count++;
            }else {
                bool=false;
            }
            caa=ca;
            cbb=cb;
            if (instance>k)count--;
        }
        System.out.println(count);
    }
}
