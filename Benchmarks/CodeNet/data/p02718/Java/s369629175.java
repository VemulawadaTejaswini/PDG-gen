import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int total = 0;
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            total += A[i];
        }
        double benchmark = (double)total/(M*4);
        int ok = 0;
        for(int i=0; i<N; i++){
            if(A[i] >= benchmark){
                ok++;
            }
        }
        if(ok>=M){
            System.out.println("Yes");
        }else System.out.println("No");

    }    
}