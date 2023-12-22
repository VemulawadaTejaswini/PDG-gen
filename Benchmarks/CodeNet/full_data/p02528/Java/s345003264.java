import java.io.*;
 
class Main {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
                String[] s = br.readLine().split(" ");
                int a[] = new int[n];
                for(int i = 0;i < n;i++) {
                    a[i] = Integer.parseInt(s[i]);
                }
                sort(a, n);
                String t = String.valueOf(a[0]);
                for(int j = 1;j < n;j++) {
                    t += " " + a[j];
                }
                System.out.println(t);
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
    public static void sort(int[] a, int n) {
        int m;
        for(int i = 0;i < n;i++) {
            m=i;
            for(int j = i+1;j < n;j++) {
                if(a[m] > a[j])
                    m = j;
            }
            int tmp = a[m];
            a[m] = a[i];
            a[i] = tmp;
        }
    }
}