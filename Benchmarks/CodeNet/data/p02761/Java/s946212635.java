import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int keta[] = new int[N];
        int ketac[] = new int[N];
        for(int i=0; i<M; i++) {
            int ketasu = sc.nextInt();
            int ketanum = sc.nextInt();
            if(keta[ketasu-1] == ketanum && ketac[ketasu-1] >0) {
                continue;
            }
            keta[ketasu-1] = ketanum;
            ketac[ketasu-1]++;
        }

        for(int i=0; i<N; i++) {
            if(ketac[i] > 1) {
                System.out.println(-1);
                return;
            }
        }

        String number = "";

        for(int i=0; i<N; i++) {
            number = number + String.valueOf(keta[i]);
        }

        if(number.charAt(0) == '0') {
            System.out.println(-1);
            return;
        }

        System.out.println(number);

        
    }

}
