import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[100];
        int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int cnt = 0;
        for(int i = 0;i<N;i++){
            A[i] = sc.nextInt();
            for(int j = 1;j<=D;j=j+A[i]){
                cnt++;
            }
        }
        System.out.println((X+cnt));
    }
}
 