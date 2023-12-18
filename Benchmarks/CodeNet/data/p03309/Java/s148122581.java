import java.util.Scanner;

class Main {
    public static long kanacy(long b, long[] a) {
        long sum=0;
        for(int i=0; i<a.length; i++) {
            sum += Math.abs(a[i] - b);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        //long max = 0;
        long offsetMax =0;
        long offsetMin = 1000000;
        long[] offset = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            //max = a[i]>max ? a[i] : max;
            offset[i] = a[i] - (i+1);
            offsetMax = offset[i]>offsetMax ? offset[i] : offsetMax;
            offsetMin = offset[i]<offsetMin ? offset[i] : offsetMin;
        }
        sc.close();
        long kmin = 1000000; 
        if(offsetMax==0) offsetMax=1;
        Boolean plus = true;
        long bt = kmin, b=0;
        while(true) {
            long t = kanacy(b, offset);
            if(t>bt) {
                if(!plus) break;
                b=0;
                plus = false;
            }
            if(plus) b++;
            else b--;
            if(t<kmin) kmin = t;
            bt = t;
        }
        System.out.println(kmin);
   }
}