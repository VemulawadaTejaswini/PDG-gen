import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] Hz = new int[N];
        for (int i = 0; i < N; i++){
            Hz[i] = sc.nextInt();
        }
        int[] Az = new int[M];
        int[] Bz = new int[M];
        for (int i = 0; i < M; i++){
            Az[i] = sc.nextInt() - 1;
            Bz[i] = sc.nextInt() - 1;
        }

        int[] good_flgz = new int[N];
        Arrays.fill(good_flgz, 1);
        for (int i = 0; i < M; i++){
//            System.out.println("aaa> "+Hz[Az[i]]+" "+Hz[Bz[i]]);
            if (Hz[Az[i]] > Hz[Bz[i]]){
//                System.out.println(Bz[i]);
                good_flgz[Bz[i]] = 0;
            } else if (Hz[Az[i]] < Hz[Bz[i]]){
//                System.out.println(Az[i]);
                good_flgz[Az[i]] = 0;
            } else {
//                System.out.println("bb> "+Az[i]+" "+Bz[i]);
                good_flgz[Az[i]] = 0;
                good_flgz[Bz[i]] = 0;
            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++){
//            System.out.println("good_flgz "+good_flgz[i]);
            sum += good_flgz[i];
        }
        System.out.println(sum);
    }


}