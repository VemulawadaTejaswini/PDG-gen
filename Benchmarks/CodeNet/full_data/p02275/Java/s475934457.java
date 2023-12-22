import java.util.*;
import java.io.*;
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
 
        String s = br.readLine();
        String[] str = s.split(" ");
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }
        fSort(a,n,10000);
 
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n-1; i++) {
            sb.append(a[i]).append(" ");
        }
        System.out.println(sb.append(a[n-1]));
 
        br.close();
    }
 
    static void fSort(int[] a,int n,int max) {
        int[] f = new int[max+1];
        int[] b = new int[n];
 
        for(int i=0; i<n; i++) f[a[i]]++;
        for(int i=1; i<=max; i++) f[i] += f[i-1];
        for(int i=n-1; i>=0; i--) b[--f[a[i]]] = a[i];
        for(int i=0; i<n; i++) a[i] = b[i];
    }
}
