import java.util.Scanner;

class Main {
    static public void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long Abomb = scan.nextLong();
        long Bbomb = scan.nextLong();
        long mon[] = new long[n];
        for(int i = 0; i < n; i++){
            mon[i] = scan.nextLong();
        }
        long l = 0;
        long r = (long)1e9+1;

        long m = 0;
        while(l < r - 1){
            m = (l + r) / 2;
            long cent = 0;

            for(int i = 0; i < n; i++){
                long HP = mon[i] - (Bbomb * m);
                if(HP > 0){
                    cent += HP / (Abomb -Bbomb) + ((HP % (Abomb - Bbomb) == 0) ? 0 : 1);
                }
            }

            if(cent >= m)
                l = m;
            else
                r = m;
        }
        System.out.println(l >= r ? r : l);
    }
}
