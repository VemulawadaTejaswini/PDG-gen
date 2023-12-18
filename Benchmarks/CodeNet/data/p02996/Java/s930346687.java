import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        boolean[] ba = new boolean[n];
        //boolean[] bb = new bpplean[n];
         
         for(int i = 0; i < n;i++) {
             a[i] = stdIn.nextLong();
             b[i] = stdIn.nextLong();
             ba[i] = false;
             //bb[i] = true;
         }

         long time = 0;

         for(int i = 0; i < n; i++) {
             long min = 1000000001;
             int mj = 0;
            for(int j = 0; j < n; j++) {
                if(b[j] < min && ba[j] == false) {
                    min = b[j];
                    mj = j;
                }
            }
            if(min < time && mj != 0 || min < time && min != 1000000001) {
                System.out.println("no");
                System.exit(0);
            }
            ba[mj] = true;
            time += a[mj];
         }

         System.out.println("Yes");


         


        
    }
}

