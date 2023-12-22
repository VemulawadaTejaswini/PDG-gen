import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    
    int[] A = new int[(int)(N)];
    int[] B = new int[(int)(M)];
    
    for(int i = 0 ; i < N ; i++){
                A[i] = sc.nextInt();
    }
    
    for(int i = 0 ; i < M ; i++){
                B[i] = sc.nextInt();
    }

    int a = 0;
    int b = 0;
    int ans = 0;

    while(K > 0){
        if(a < N && b < M){
            if(A[a] <= B[b]){
                K = K - A[a];
                if(!(K < 0)){
                    a++;
                    ans++;                    
                }
            }else{
                K = K - B[b];
                if(!(K < 0)){
                    b++;
                    ans++;                    
                }
            }
        }else if(!(a < N) && b < M){
            K = K - B[b];
            if(!(K < 0)){
                b++;
                ans++;                    
            }
        }else if(a < N && !(b < M)){
            K = K - A[a];
            if(!(K < 0)){
                a++;
                ans++;                    
            }
        }else{
            break;
        }
    }
    System.out.println(ans);
    }
}
