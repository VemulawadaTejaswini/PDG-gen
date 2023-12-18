import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[(int) N];
        int ans = 1;
        
        for(int i = 0 ; i < N ; i++){
                A[i] = sc.nextInt(); 
        }
        
        for(long i = 0; i < K ;i++){
            ans = A[ans - 1];
        }
        
        System.out.println(ans);
    }
}
