import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<M;i++){
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int maxnum = N * M;
        int reg,reg2;
        long sum = 1;
        int Mlarge = 0;
        int Nlarge = 0;
        while(maxnum > 0){
            reg = 0;
            reg2 = 0;
            if(Arrays.binarySearch(A, maxnum) >= 0 && Arrays.binarySearch(B, maxnum) >= 0){
                maxnum--;
                Mlarge++;
                Nlarge++;
            }else if(Arrays.binarySearch(A, maxnum) >= 0){
                sum *= Mlarge;
                sum = sum % 1000000007;
                maxnum--;
                Nlarge++;
            }else if(Arrays.binarySearch(B, maxnum) >= 0){
                sum *= Nlarge;
                sum = sum % 1000000007;
                maxnum--;
                Mlarge++;
            }else{
                sum *= (Nlarge * Mlarge - (N * M - maxnum));
                sum = sum % 1000000007;
                maxnum--;
            }
        }
        System.out.println(sum % 1000000007);
    }
}