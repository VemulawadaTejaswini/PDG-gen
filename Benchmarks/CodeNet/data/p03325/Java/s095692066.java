import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
       int[] a = new int[n];
       int res = 0;
        
       for(int i=0; i<n; i++) {
           a[i] = sc.nextInt();
       }
       sc.close();

       for(int i=0; i<n; i++) {
            while(a[i]%2 == 0) {
                a[i] /= 2;
                res++;
            }
       }
       System.out.println(res);
    }
}