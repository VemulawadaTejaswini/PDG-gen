import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] c = new int[n];
        int[][] a = new int[n][m];
        for (int i=0;i<n;i++){
            c[i]=sc.nextInt();
            for (int j=0;j<m;j++)a[i][j]=sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int i=0;i<Math.pow(2,n);i++){
            String s = Integer.toBinaryString(i);
            while (s.length()<n)s="0"+s;
            int instance = 0;
            int[] intel = new int[m];
            for (int j=0;j<n;j++){
                if (s.charAt(j)=='1'){
                    instance+=c[j];
                    for (int k=0;k<m;k++){
                        intel[k]+=a[j][k];
                    }
                }
            }
            boolean b=true;
            for (int j=0;j<m;j++){
                if (intel[j]<x)b=false;
            }
            if (b)ans=Math.min(ans,instance);
        }
        if (ans==Integer.MAX_VALUE)System.out.println(-1);
        else System.out.println(ans);
    }
}
