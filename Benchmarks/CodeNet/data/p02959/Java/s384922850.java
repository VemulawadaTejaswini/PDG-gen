import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N];

        for(int i=0;i<N+1;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            B[i]=sc.nextInt();
        }
        sc.close();
        int x = 0;
        int c=0;
        for(int i=0;i<N;i++){
            if(i<N-1){
                // モンスターの数が少ない時
                if(A[i]<B[i]){
                    // 倒す数はモンスターの数
                    x=x+A[i];
                    // 次の勇者に引き継がれる攻撃力
                    B[i+1]=B[i+1]+B[i]-A[i];
                }
                // モンスターの数が多い時
                else{
                    // 倒す数は勇者の攻撃力分
                    x=x+B[i];
                }
            }
            if(i==N-1){
                if(A[i]<B[i]){
                    // 倒す数はモンスターの数
                    x=x+A[i];
                    // N+1に残る攻撃力
                    c=B[i]-A[i];
                }
                // モンスターの数が多い時
                else{
                    // 倒す数は勇者の攻撃力分
                    x=x+B[i];
                }
            }
        }
        if(A[N]<c){
            x=x+A[N];
        }else{
            x=x+c;
        }
        System.out.println(x);
    }
}