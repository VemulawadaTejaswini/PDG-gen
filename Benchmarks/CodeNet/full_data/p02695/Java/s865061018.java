import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] arrayA = new int[N];
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        int sum = 0;
        int Max = 0;

        for(int i=0; i < N; i++){
            arrayA[i] = 1;
        }

        for(int i=0; i < Q; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        // arrayAの数列を後ろのほうから1ずつ増やしていく
        for(int i=N-1; i>=0; i--){
            while (arrayA[i]<=M) {
                sum = 0;
                // 上の階層のループで決まったarrayAについて条件に合うものを足していく
                for(int j=0; j < Q; j++){
                   if(arrayA[b[j]-1]-arrayA[a[j]-1] == c[j]){
                       sum += d[j];
                   }
                }
                Max = Math.max(sum, Max);
                if(arrayA[i] == M){
                    break;
                }else{
                    arrayA[i] += 1;
                }       
            }
        }
        System.out.println(Max);

    }
}