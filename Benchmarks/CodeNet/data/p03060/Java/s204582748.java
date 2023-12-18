import java.util.*;

class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer V[] = new Integer[N];
        for (int i=0; i<N; i++){
          V[i] =sc.nextInt();
        }
        Integer C[] = new Integer[N];
        for (int i=0; i<N; i++){
          C[i] =sc.nextInt();
        }
        int ans = 0;
        for (int i=0; i<N; i++) {
          int benefit = V[i] -C[i];
          if (benefit >= 0){
            ans += benefit;
          }
        }
      System.out.println(ans);
    }
}