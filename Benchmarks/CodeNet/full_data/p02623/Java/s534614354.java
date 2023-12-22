import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();

        int[] A = new int[N];
        int[] B = new int[M];
        int counts = 0;
        int Acount = 0;
        int Bcount = 0;

        for(int i=0;i<N;i++){
            A[i] = scan.nextInt();
        }
        for(int i=0;i<M;i++){
            B[i] = scan.nextInt();
        }
        
        int setA = set(Acount, N, A, K);
        int setB = set(Bcount, M, B, K);
        for(;K>0;){
            if(setA!=0 && setB!=0){
                if(setA<=setB){
                    K-=setA;

                    counts+=1;
                    Acount++;
                }else{
                    K-=setB;
                    counts+=1;
                    Bcount+=1;
                }
            }else if(setA==0 && setB==0){
                break;
            }else{
                if(setA>=setB){
                    K-=setA;
                    counts+=1;
                    Acount+=1;
                }else{
                    K-=setB;
                    counts+=1;
                    Bcount+=1;
                }
            }
            setA = set(Acount, N, A, K);
            setB = set(Bcount, M, B, K);
        }

        System.out.println(counts);
    }

    public static int set(int count, int L, int[]C ,int K){
        if(count<L){
            if((K-C[count])>=0){
                return C[count];
            }else{
                return 0;
            }
        }else{
            return 0;
        }
    }
}