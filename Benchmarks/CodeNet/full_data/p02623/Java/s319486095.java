import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        long Az[] = new long[N];
        long Bz[] = new long[M];
        for (int i = 0; i < N; i++) {
            Az[i] = sc.nextLong();
        }
        for (int i = 0; i < M; i++) {
            Bz[i] = sc.nextLong();
        }
        long sum = 0;
        int a = 0; int b = 0;

        for (int i = 0; i < Az.length+Bz.length; i++){
//            System.out.println(a+" "+b);
            if (a >= Az.length){
                sum += Bz[b];
                b++;
            }
            else if (b >= Bz.length){
                sum += Az[a];
                a++;
            } else if (Az[a] >= Bz[b]){
                sum += Bz[b];
                b++;
            } else {
                sum += Az[a];
                a++;
            }

            if (sum > K){
//                System.out.println("aa");
                a--;
                break;
            }
        }
//        System.out.println("aaaaaaa");
//        System.out.println(a+" "+b);
        System.out.println(a+b);
    }
}