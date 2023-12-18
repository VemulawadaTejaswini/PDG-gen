import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];
        for (int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            h[i]=sc.nextInt();
        }
        String ans="";
        boolean a = true;
        for (int i=0;i<=100&&a;i++){
            for (int j=0;j<=100&&a;j++){
                boolean b = true;
                for (int k=0;k<n-1&&b;k++){
                    int p = Math.abs(i-x[k])+Math.abs(j-y[k])+h[k];
                    int q = Math.abs(i-x[k+1])+Math.abs(j-y[k+1])+h[k+1];
                    if (p!=q||p<=0||q<=0)b=false;
                }
                if (b){
                    a=false;
                    ans = i+" "+j+" "+(Math.abs(i-x[0])+Math.abs(j-y[0])+h[0]);
                }
            }
        }
        System.out.println(ans);
    }
}
