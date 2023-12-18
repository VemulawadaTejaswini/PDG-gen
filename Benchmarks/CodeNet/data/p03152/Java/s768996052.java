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
        while(maxnum > 0){
            reg = 0;
            reg2 = 0;
            if(Arrays.binarySearch(A, maxnum) >= 0 && Arrays.binarySearch(B, maxnum) >= 0){
                maxnum--;
            }else if(Arrays.binarySearch(A, maxnum) >= 0){
                for(int i=0;i<M;i++){
                    if(B[i] > maxnum){
                        reg++;
                    }
                }
                if(reg == 0){
                    sum = 0;
                    break;
                }
                sum *= reg;
                sum = sum % 1000000007;
                maxnum--;
            }else if(Arrays.binarySearch(B, maxnum) >= 0){
                for(int i=0;i<N;i++){
                    if(A[i] > maxnum){
                        reg++;
                    }
                }
                if(reg == 0){
                    sum = 0;
                    break;
                }
                sum *= reg;
                sum = sum % 1000000007;
                maxnum--;
            }else{
                for(int i=0;i<N;i++){
                    if(A[i] > maxnum){
                        reg2++;
                    }
                }
                for(int i=0;i<M;i++){
                    if(B[i] > maxnum){
                        reg++;
                    }
                }
                if(reg == 0 && reg2 == 0){
                    sum = 0;
                    break;
                }
                sum *= (reg * reg2 - (N * M - maxnum));
                sum = sum % 1000000007;
                maxnum--;
            }
        }
        System.out.println(sum % 1000000007);
    }
}