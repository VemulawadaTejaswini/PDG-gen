import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer d[] = new Integer[N];
        for(int i = 0; i<N; i++){
            d[i] = sc.nextInt();
        }
        int sum = 0;
        for(int j = 0; j<N-2; j++){
            for(int k = j+1; k<N-1; k++){
                for(int h = k+1; h<N; h++){
                    int A = d[j];
                    int B = d[k];
                    int C = d[h];
                    if(((A < B+C) && (B < C+A)) && (C < A+B)){
                        sum = sum+1;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}