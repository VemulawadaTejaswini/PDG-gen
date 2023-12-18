import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] b = new int[n-1];
        for(int i = 0;i<n-1;i++) {
            b[i] = stdIn.nextInt();
        }
        int count = 0;
        int[] a = new int[n];
        for(int i = 0;i<b.length;i++) {
            if(i==0)    {a[i] = b[i]; a[i+1] = b[i];}
            else {
                a[i] = Math.min(a[i],b[i]);
                a[i+1] = b[i];
            }
        }
        for(int i = 0;i<a.length;i++) {
            count += a[i];
        }
        System.out.println(count);
    }
}